<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
<!-- Bootstrap -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- font awesome -->
<link rel="stylesheet" href="css/font-awesome.min.css" media="screen" title="no title" charset="utf-8">
<!-- Custom style -->
<link rel="stylesheet" href="css/style.css" media="screen" title="no title" charset="utf-8">
</head>
<body>
      <article class="container" >
        <div class="page-header text-center" >
          <h1>로그인 <small>Log in</small></h1>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="form-group">
              <input type="text" class="form-control" id="Id" placeholder="아이디">
			            </div>
			
            <div class="form-group">
              <input type="password" class="form-control" id="Password" placeholder="비밀번호">
            </div>
			
			<div class="form-group">
              <button type="button" class="form-control btn btn-danger" id="loginbtn">코맨 계정으로 로그인</button> 
			<hr />           
            </div>
            
                        
           <div class ="form-group">
           <button type="button" class="form-control btn btn-success" id="naverloginbtn">네이버 아이디로 로그인</button>
 			</div>
							
			<br />				
 			<div class = "form-group text-center">
 			<a href="www.sajangnim.co.kr"><strong>ID / PASSWORD 찾기</strong></a>
 			</div>           
            
      </article>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>