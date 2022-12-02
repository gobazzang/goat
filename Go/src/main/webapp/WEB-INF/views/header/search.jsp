<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="../../../resources/CSS/search.css?version=1.3" type="text/css">
</head>
<body>
<div id="container">
<%@ include file="../header/header.jsp"%>
<table id="table1">
    <tr>
    <td>KEYWORD</td>
    <td colspan="2"><input type="text" id="keyword" name="keyword"
							maxlength='20' class="box"> <select name="keyword"
							class="keywordselect">
								<option value="@naver.com">상품명</option>
								<option value="@daum.com">상품코드</option>
								<option value="@google.com">모델명</option>
								<option value="@google.com">브랜드명</option>
						</select></td>
    </tr>
</table>
<div>
<input type="submit" value="SEARCH" id="search3" class="button">
</div>
<%@ include file="../header/footer.jsp"%>
</div>
</body>
</html>