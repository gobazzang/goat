<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import = "java.sql.*" %>
      <%@ page import = "javax.sql.*" %>
      <%@ page import = "javax.naming.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../../../resources/CSS/mypagefavorite.css?version=1.4" type="text/css">
</head>
<body>
 <div id = "container">
  <%@ include file="../header/header.jsp"%>
  <form action="/mypage/favorite" method="post">
  <h1>MEMBER INFO</h1>
  <hr size = "1" color = "black"><br><br>
  <table>
  <tr>
       <td>비밀번호</td>
       <td><input type ="password" name="password"></td>
  </tr>
  </table>
  <div id = "footer"><input type = "submit" value = "탈퇴" class="backbtn" >
<a href = "mypage"><input type = "button" value = "취소" class="backbtn"></a>
</div>
</form>
  </div>
</body>
</html>