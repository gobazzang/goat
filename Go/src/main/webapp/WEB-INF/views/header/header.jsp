<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/CSS/header.css?version=1.2" type="text/css">
<script type="text/javascript" src="../../../resources/JS/header.js"></script>
</head>
<body>
<header>
		<div class="dropdown">
      <span class="dropbtn"><img src="../../../resources/image/meun.png"></span>
      <div class="dropdown-content">
        <a href="../list/outwear">OUTWEAR</a>
        <a href="../list/top">TOP</a>
        <a href="../list/bottom">BOTTOM</a>
        <a href="../list/headwear">HEADWEAR</a>
        <a href="../list/bag">BAG</a>
        <a href="../list/shoes">SHOES</a>
        <a href="../list/eyewear">EYEWEAR</a>
        <a href="../list/acc">ACC</a>
        <br>
        <br>
        <a href="../list/list">NOTICE</a>
        <a href="../review/review">REVIEW</a>
        
      </div>
    </div> 
   <a href="../header/search"><img src="../../../resources/image/search.png" id="search"></a>
    <div id="category">
    <h1><a href="../main/main"><img src="../../../resources/image/logo1.png" id="logo"></a></h1>
    </div>
		<nav>
		<% 
		String id = (String) session.getAttribute("id");
		if(id==null){%>
			<a href="../header/login"><input type="button" value="login" class="btn" id="login"></a>
			<a href="../header/signup"><input type="button" value="signup" class="btn"></a>
		<% }else{%>
			<%if(id.equals("manager")){ %>  <!-- 아이디가 manager(관리자)일 경우 마이페이지 대신 관리자 버튼 -->
				<a href="../manager/manager"><input type="button" value="manager" class="btn"></a>
				<a href="../manager/orderlist1"><input type="button" value="orderlist" class="btn"></a>
				<a href="../header/logout"><input type="button" value="logout" class="btn"></a>
			<%}else{%>
				<a href="../mypage/my"><input type="button" value="mymage" class="btn"></a>
				<a href="../pay/basket"><input type="button" value="cart" class="btn"></a>
				<a href="../header/logout"><input type="button" value="logout" class="btn"></a>
			<%}
		}%>
		</nav>
	</header>
</body>
</html>