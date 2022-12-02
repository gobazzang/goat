<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/CSS/my.css?version=3.7" type="text/css">
</head>
<body>
<div class="box">
<%@ include file="../header/header.jsp"%>
		<div class="left">
			<div class="left-top">
			<a href="/purchase/orderlist">
			<button type="button" id="orderlist">ORDER LIST</button>
			</a>
			</div>
			<div class="left-bottom">
			<a href="/mypage/mypage">
			<button type="button" id="mypage">MYPAGE</button>
			</a>
			</div>
		</div>
		<div class="right">
			<div class="right-top">
			<a href="../pay/basket">
			<button type="button" id="cart">CART</button>
			</a>
			</div>
			<div class="right-bottom">
			<a href="/memModify">
			<button type="button" id="mylist">MY LIST</button>
			</a>
			</div>
		</div>
		<div class="withdrawal">
			<a href="/mypage/favorite">
			<button type="button" id="withdrawal">Withdrawal</button>
			</a>
			</div>
			<%@ include file="../header/footer2.jsp" %>
	</div>
</body>
</html>
