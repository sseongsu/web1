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
          <h1>회원가입 <small>Sign up</small></h1>
        </div>
        <div class="col-md-6 col-md-offset-3">
            <div class="form-group">
              <label for="InputId">아이디</label>
              <input type="text" class="form-control" id="Id" placeholder="아이디">
				<button class="btn btn pull-right " type="button">아이디체크</button>            </div>
			
            <div class="form-group">
              <label for="InputPassword1">비밀번호</label>
              <input type="password" class="form-control" id="Password" placeholder="비밀번호">
            </div>
			
            <div class="form-group">
              <label for="InputPassword2">비밀번호 확인</label>
              <input type="password" class="form-control" id="Password2" placeholder="비밀번호 확인">
              <p class="help-block">비밀번호 확인을 위해 다시 한번 입력 해 주세요</p>
            </div>
            <div class="form-group">
              <label for="username">이름</label>
              <input type="text" class="form-control" id="Name" placeholder="이름을 입력해 주세요">
            </div>
                     
			<div class="form-group">
              <label for="InputNumber">전화 번호</label>
              <input type="text" class="form-control" id="PhoneNum" placeholder="전화 번호를 입력해 주세요">
            </div>

            <div class="form-group">
              <label for="InputEmail">이메일 주소</label>
              <input type="email" class="form-control" id="Email" placeholder="이메일 주소를 입력해 주세요">
            </div>
            
            <div class="form-group">
              <label for="InputCompany">업체명</label>
              <input type="text" class="form-control" id="Company" placeholder="업체명을 입력해 주세요">
            </div>
            <div class="form-group">
            <table>
				<tr>
					<br />
					<td style="text-align:left;border:1px solid #e0e0e0;background-color:f9f9f9;padding:5px">
						<div style="padding-top:7px;padding-bottom:5px;font-weight:bold;padding-left:7px;">※ 개인정보 수집 및 이용에 관한 안내</div>
						<div style="padding-left:10px;">
							<div style="width:97%;height:95px;font-size:11px;letter-spacing: -0.1em;border:1px solid #c5c5c5;background-color:#fff;padding-left:14px;padding-top:7px;">
								1. 수집 개인정보 항목 : 이름, 전화번호, 이메일 주소, 업체명 <br />
								2. 개인정보의 수집 및 이용목적 : 제휴신청에 따른 본인확인 및 원활한 의사소통 경로 확보 <br />
								3. 개인정보의 이용기간 : 모든 검토가 완료된 후 3개월간 이용자의 조회를 위하여 보관하며, 이후 해당정보를 지체 없이 파기합니다. <br />
								4. 그 밖의 사항은 개인정보취급방침을 준수합니다.
							</div>
						</div>
						<div style="padding-top:7px;padding-left:5px;padding-bottom:7px;">
							<input type="checkbox" name="info" value="1" class="input_radio"> 개인정보 수집 및 이용에 대해 동의합니다.
						</div>
					</td>
				</tr>
				</table>
			</div>
            <div class="form-group text-center">
              <button type="submit" class="btn btn-info" onclick="location.href='/WEB-INF/views/join_ok.jsp'">회원가입<i class="fa fa-check spaceLeft"></i></button>
              <button type="submit" class="btn btn-warning">취소<i class="fa fa-times spaceLeft"></i></button>
            </div>
        </div>

      </article>

    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
</body>
</html>