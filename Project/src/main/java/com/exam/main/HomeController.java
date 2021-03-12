package com.exam.main;

import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model1.BoardDAO;
import model1.BoardTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("/login.spring")
	public ModelAndView login() {	
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "login" );		
		return modelAndView;
		
	}
	
	@RequestMapping("/join.spring")
	public ModelAndView join() {	
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "join" );		
		return modelAndView;
		
	}
	
	@RequestMapping("/info.spring")
	public ModelAndView info() {	
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "info" );		
		return modelAndView;
		
	}
	
	@RequestMapping("/cal.spring")
	public ModelAndView cal() {	
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "cal" );		
		return modelAndView;
		
	}
	
	@RequestMapping("/mypage.spring")
	public ModelAndView mypage() {	
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "mypage" );		
		return modelAndView;
		
	}
	
	@RequestMapping("/list.spring")
	public ModelAndView List() {
		System.out.println( "ListAction 호출" );
		
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardTO> lists = dao.boardList();
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "board_list1" );
		modelAndView.addObject( "lists", lists );
		
		return modelAndView;
		
	}
	
	@RequestMapping("/write.spring")
	public ModelAndView Write() {
		System.out.println( "WriteAction 호출" );
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "board_write1" );
		
		return modelAndView;
	}
	
	@RequestMapping("/write_ok.spring")
	public ModelAndView WriteOk(HttpServletRequest request, HttpServletResponse response) {
		System.out.println( "WriteOkAction 호출" );
		
		BoardTO to = new BoardTO();
		to.setSubject( request.getParameter( "subject" ) );
		to.setWriter( request.getParameter( "writer" ) );
		to.setMail( "" );
		if( !request.getParameter( "mail1" ).equals("") && !request.getParameter( "mail2" ).equals("")) {
			to.setMail( request.getParameter( "mail1" ) + "@" + request.getParameter( "mail2" ) );
		}
		to.setPassword( request.getParameter( "password" ) );
		to.setContent( request.getParameter( "content" ) );
		
		to.setWip( request.getRemoteAddr() );
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardWriteOk(to);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "board_write1_ok" );
		modelAndView.addObject( "flag", flag );

		return modelAndView;
	}
	
	@RequestMapping("/view.spring" )
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		System.out.println( "ViewAction 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		
		BoardDAO dao = new BoardDAO();
		to = dao.boardView(to);
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "board_view1" );
		modelAndView.addObject( "to", to );
		
		return modelAndView;
	}
			
	@RequestMapping("/delete.spring")
	public ModelAndView Delete(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println( "DeleteAction 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );

		BoardDAO dao = new BoardDAO();
		to = dao.boardDelete( to );
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("board_delete1");
		modelAndView.addObject("to", to);
		
		return modelAndView;
	}
		
	@RequestMapping( value = "/delete_ok.spring", method = RequestMethod.POST)
	public String DeleteOk(HttpServletRequest request, HttpServletResponse response, Model model) {
		
		System.out.println( "DeleteOk()호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		to.setPassword( request.getParameter( "password" ) );

		BoardDAO dao = new BoardDAO();
		int flag = dao.boardDeleteOk( to );
		
		model.addAttribute("flag", flag);
		
		return "board_delete1_ok";
	}
	
	@RequestMapping("/modify.spring")
	public ModelAndView Modify(HttpServletRequest request, HttpServletResponse response) {
		System.out.println( "ModifyAction 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		
		BoardDAO dao = new BoardDAO();
		to = dao.boardModify( to );
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName( "board_modify1" );
		modelAndView.addObject( "to", to );
		
		return modelAndView;
	}
	
	@RequestMapping( value = "/modify_ok.spring" , method = RequestMethod.POST)
	public String ModifyOk(HttpServletRequest request, HttpServletResponse response, Model model) {
		System.out.println( "ModifyOk 호출" );
		
		BoardTO to = new BoardTO();
		to.setSeq( request.getParameter( "seq" ) );
		to.setPassword( request.getParameter( "password" ) );
		
		to.setSubject( request.getParameter( "subject" ) );
		to.setMail( "" );
		if( !request.getParameter("mail1").equals("") && !request.getParameter("mail2").equals("") ) {
			to.setMail( request.getParameter("mail1") + "@" + request.getParameter("mail2") );
		}
		to.setContent( request.getParameter( "content" ) );
		
		BoardDAO dao = new BoardDAO();
		int flag = dao.boardModifyOk( to );

		model.addAttribute("flag", flag );
		model.addAttribute("seq", to.getSeq() );
		
		return "board_modify1_ok";
	}
	
}
