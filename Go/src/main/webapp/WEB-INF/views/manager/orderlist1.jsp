<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script type="text/javascript" src="../../../resources/JS/basket.js"></script>
	<link rel="stylesheet" href="../../../resources/CSS/basket.css?version=5.5" type="text/css">
</head>
<body>
<%@ include file="../header/header.jsp"%>
<h1 id="h123">ORDER LIST</h1>
<form action="/purchase/orderlist" method="post" onsubmit="return jsSubmit();">
    <div id="content">
			<input type="text" name="id" value="${id}" hidden="true">
		<div id="middle">	
			<table   id="ta1">
				<tr align="center" bgcolor="#e9ecef" id="tr2">
				    <td class="pname" id="id"><span>ID</span></td>
					<td class="pname" id="pname"><span>name</span></td>
					<td class="uniprice" id="uniprice"><span>price</span></td>
					<td class="quantitiy" id="quantitiy"><span>qty.</span></td>
					<td class="total" id="total"><span>total</span></td>
					<td class="order" id="order"><span>delete</span></td>
					<td class= "hidden1" id="pname"></td>
				</tr>
				<c:forEach items="${orderlist1}" var="basketlist">
               <tr id="listTr">
                  <td class="id">${basketlist.id}<input type="hidden" name="id" id="id" value="${basketlist.id}"></td>
                  <td class="pname">${basketlist.pname}<input type="hidden" name="pname" id="pname" value="${basketlist.pname}"> </td>
                  <td class="uniprice">${basketlist.uniprice}<input type="hidden" name="uniprice" id="uniprice" value="${basketlist.uniprice}"> </td>
                  <td class="quantitiy"><input type="text" class="quantitiy" name="quantitiy" onkeyup="total(${basketlist.pno})" id="quantitiy${basketlist.pno}" value="${basketlist.quantitiy}" readonly style="border: none; background: transparent;" ><br>
                  <input type="hidden" name="uniprice" id="uniprice${basketlist.pno}" value="${basketlist.uniprice}"></td>
                  <td class="total"><input type="text" name="total"  id="sum${basketlist.pno}" readonly style="border: none; background: transparent;"></td>  
                  <td class="order"><input type="button" onclick="remove(${basketlist.pno})" value="삭제" class="backbtn1"></td> 
                  <td><input type="hidden" class="pno" name="pno" value="${basketlist.pno}"></td>
               </tr>
               </c:forEach>
           </table>
              </div>
                  </div>
                  </form>
                  <%@ include file="../header/footer.jsp"%>
                  
 </body>
</html>      