<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>index</title>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, user-scalable=no" />
<link rel="stylesheet" href="assets/css/main.css" />
</head>
<body>

	<!-- Header -->
	<header id="header">
		<div class="inner">
			<a href="index.jsp" class="logo">cost manager</a>
			<nav id="nav">
				<a href="./info.spring">소개</a>
				<a href="./cal.spring">계산기</a>
				<a href="./mypage.spring">마이페이지</a>
				<a href="./login.spring">로그인</a>
				<a href="./join.spring">회원가입</a>
			</nav>
		</div>
	</header>
	<a href="#menu" class="navPanelToggle"><span class="fa fa-bars"></span></a>

	<!-- One -->
	<section id="one">
		<jsp:include page="/WEB-INF/views/innerjoin_ok.jsp" flush="false"/>
	</section>


	<!-- Footer -->
			<section id="footer">
				<div class="inner">
					<header>
						<h2>Content</h2>
					</header>
					
						<li class="first"><span class="address">Address</span> <span class="address-01">서울특별시 강남구 테헤란로1길 10 세경빌딩 3층</span> </li>
						<li> <span class="mail">Mail</span> <span class="mail-01">tlstjdtn12345@gmail.com</span> </li>
						<li> <span class="phone">Phone</span> <span class="phone-01">010-8985-8853</span> </li>
					
				</div>
			</section>

	<script src="assets/js/jquery.min.js"></script>
	<script src="assets/js/skel.min.js"></script>
	<script src="assets/js/util.js"></script>
	<script src="assets/js/main.js"></script>

</body>
</html>