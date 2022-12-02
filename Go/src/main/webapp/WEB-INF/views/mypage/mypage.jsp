<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript"
	src=" https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="../../../resources/JS/effective.js?version=1.2"></script>
<script type="text/javascript" src="../../../resources/JS/mypagesignup.js?version=1.2"></script>
<script type="text/javascript" src="../../../resources/JS/Sing Up.js"></script>
<link rel="stylesheet" href="../../../resources/CSS/mypage.css?version=1.4" type="text/css">
</head>
<body>
	<div id="container">
		<%@ include file="../header/header.jsp"%>
		<form action="/mypage/mypage" method="post"
			onsubmit="return jsSubmit();">

			<h1 class="title">MY PAGE</h1>

			<table>
				<tr>
					<td><span>*</span></td>
					<td>이름</td>
					<td><input type="text" name="name" value="${member.name}"
						class="box"></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>아이디</td>
					<td><input type="text" readonly name="id" id="idchk"
						value="${member.id}" class="box"> <span id="idmsg"></span></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>비밀번호</td>
					<td><input type="password" id="pwchk" name="password"
						value="${member.password}" class="box"> <span id="pwmsg"></span></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>비밀번호확인</td>
					<td><input type="password" id="rechk"
						value="${member.password}" class="box"> <span id="remsg"></span></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>생년월일</td>
					<td><input type="text" name="birth" value="${member.birth}"
						class="box"></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>가입일자</td>
					<td><input type="text" name="memdate"
						value="${member.memdate}" class="box"></td>
				</tr>
				<tr>
					<td><span></span></td>
					<td>E-mail</td>
					<td><input type="text" name="email" value="${member.email}"
						class="box"></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>휴대폰번호</td>
					<td><input type="text" name="phone" value="${member.phone}"
						class="box"></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>주소</td>
					<td>
					<input type="text" name="addr" value="${member.addr}" class="box1"><br>        
					<input type="text" name="addr2" value="${member.addr2}" ><br>
					<input type="text" name="addrDetail" value="${member.addrDetail}"> 
					<input type="text" name="addrExtra" value="${member.addrExtra}">
						
						</td>
				</tr>
			</table>

			<div class="btn1">
				<input type="submit" value="수정" class="backbtn">
				 <a href="../main/main"><input type="button" value="취소" class="backbtn"></a>
			</div>
		</form>
	</div>
	<%@ include file="../header/footer.jsp"%>
</html>