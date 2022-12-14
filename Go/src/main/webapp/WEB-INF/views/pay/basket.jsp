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
<h1 id="h123">CART</h1>
<form action="/pay/basket" id="form" method="post" onsubmit="return jsSubmit();">
    <div id="content">
			<input type="text" name="id" value="${id}" hidden="true">
		<div id="middle">	
			<table align="center" id="ta1">
				<tr align="center" bgcolor="#e9ecef" id="tr2">
					<td class="check"><span>NO<br><input type="checkbox" name="" value='selectall' onclick='selectAll(this)'></span></td>
					<td class="pname"><span>name</span></td>
					<td class="uniprice"><span>price</span></td>
					<td class="quantitiy"><span>qty.</span></td>
					<td class="total"><span>total</span></td>
					<td class="order"><span>delete</span></td>
					<td class= "hidden1"></td>
				</tr>
				<c:forEach items="${basket}" var="basketlist">
               <tr id="listTr">
                  <td class="check"><input type="checkbox" name="chkbox" value="${basketlist.pno}" id="chkbox" class="chkbox" onclick="itemSum(${basketlist.pno});"></td>
                  <td class="pname">${basketlist.pname}</td>
                  <td class="uniprice">${basketlist.uniprice}</td>
                  <td class="quantitiy"><input type="text" class="quantitiy" name="quantitiy" onkeyup="total(${basketlist.pno})" id="quantitiy${basketlist.pno}" value="${basketlist.quantitiy}" ><br>
                  <input type="hidden" name="uniprice" id="uniprice${basketlist.pno}" value="${basketlist.uniprice}">  
                  <input type="button" onclick="change(${basketlist.pno})" value="??????" class="backbtn1"></td>
                  <td class="total"><input type="text"  id="sum${basketlist.pno}" readonly style="border: none; background: transparent;"></td>  
                  <td class="order"><input type="button" onclick="remove(${basketlist.pno})" value="??????" class="backbtn1"></td> 
                  <td><input type="hidden" class="pno" id="pno" value="${basketlist.pno}"></td>
               </tr>
               </c:forEach>
           </table>
              </div>
                  </div>
                  <!-- ?????? ?????? -->
			<div class="content_total_section">
				<div class="total_wrap">
					<table>
						<tr>
							<td>
								<table>
									<tr>
										<td>??? ?????? ??????:</td>
										<td>
											<span id="itemSum1" ></span> ???
										</td>
									</tr>
									<tr>
										<td>?????????:</td>
										<td>
											<span class="delivery_price" id="delivery_price">3000</span>???
										</td>
									</tr>									
									<tr>
										<td>??? ?????? ?????????:</td>
										<td><span id='result'></span>??? </td>
									</tr>
									<tr>
										<td>??? ??????:</td>
										<td>
											<span id='itemSum2'></span>???
										</td>
									</tr>
								</table>
							</td>
							<td>
								<table>
									<tr>
										<td></td>
										<td></td>
									</tr>
								</table>							
							</td>
						</tr>
					</table>
					<div class="boundary_div">?????????</div>
					
								<table>
									<tbody>
										<tr>
											<td>
												<strong>??? ?????? ?????? ??????:</strong>
											</td>
											<td>
												<span id="itemSum" ></span> ???
											</td>
										</tr>
									</tbody>
								</table>
						
				</div>
			</div>
			<button type="button" id="order_btn" class="order_btn">BUY</button>
			 </form>
   <%@ include file="../header/footer.jsp"%>
</body>
</html>




