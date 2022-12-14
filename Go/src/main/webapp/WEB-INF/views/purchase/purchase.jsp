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
	<script type="text/javascript" src="../../../resources/JS/purchase.js"></script>
	<link rel="stylesheet" href="../../../resources/CSS/purchase.css?version=3.0" type="text/css">
	
	
</head>
<body>
<%@ include file="../header/header.jsp"%>
<h1 id="h123">PAYMENT</h1>
<form action="/purchase/orderlist" method="post" onsubmit="return jsSubmit();">
    <div id="content">
			<input type="text" name="id" value="${id}" hidden="true">
		<div id="middle">	
			<table   id="ta1">
				<tr align="center" bgcolor="#e9ecef" id="tr2">
					<td class="pname" id="pname"><span>name</span></td>
					<td class="uniprice" id="uniprice"><span>price</span></td>
					<td class="quantitiy" id="quantitiy"><span>qty.</span></td>
					<td class="total" id="total"><span>total</span></td>
					<td class="order" id="order"><span>delete</span></td>
					<td class= "hidden1" id="pname"></td>
				</tr>
				<c:forEach items="${Purchase}" var="basketlist">
               <tr id="listTr">
                  <td class="pname">${basketlist.pname}<input type="hidden" name="pname" id="pname" value="${basketlist.pname}"> </td>
                  <td class="uniprice">${basketlist.uniprice}<input type="hidden"  id="uniprice" value="${basketlist.uniprice}"> </td>
                  <td class="quantitiy"><input type="text" class="quantitiy"  onkeyup="total(${basketlist.pno})" id="quantitiy${basketlist.pno}" value="${basketlist.quantitiy}" readonly style="border: none; background: transparent;" ><br>
                  <input type="hidden" name="uniprice" id="uniprice${basketlist.pno}" value="${basketlist.uniprice}"></td>
                  <td class="total"><input type="text" name="total"  id="sum${basketlist.pno}" readonly style="border: none; background: transparent;"></td>  
                  <td class="order"><input type="button" onclick="remove(${basketlist.pno})" value="??????" class="backbtn1"></td> 
                  <td><input type="hidden" class="pno" name="pno" value="${basketlist.pno}"></td>
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
											<span id='itemSum2'><input type="hidden" id="itemSum2"  name="quantitiy" ></span>???
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
												<span id="itemSum"><input type="hidden" id="itemSum"  name="uniprice" ></span> ???
											</td>
										</tr>
									</tbody>
								</table>
				</div>
			</div>
			<button type="submit" id="order_btn" class="order_btn">BUY</button>
           
        <div id="container">
			<input type='radio'  name="payment" value="????????????" checked="checked" >????????????
			<input type='radio'  name="payment" value="?????? ????????? ??????">?????? ????????? ??????
                  <table id="selectPay_card">
                  <tr>
					<td><span>*</span></td>
					<td>??????:</td>
					<td><input type="text" name="name" value="${member.name}"
						class="box"></td>
				</tr>
                  <tr>
					<td><span>*</span></td>
					<td>???????????????:</td>
					<td><input type="text" name="phone" value="${member.phone}"
						class="box"></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>??????:</td>
					<td>
					<input type="text" name="addr" value="${member.addr}" class="box1"><br>        
					<input type="text" name="addr2" value="${member.addr2}" ><br>
					<input type="text" name="addrDetail" value="${member.addrDetail}"> 
					<input type="text" name="addrExtra" value="${member.addrExtra}">
						
						</td>
				</tr>
                  </table>
                  
                    <table id="selectPay_new">
                  <tr>
					<td><span>*</span></td>
					<td>??????:</td>
					<td><input type="text" name="name" class="box"></td>
				</tr>
                  <tr>
					<td><span>*</span></td>
					<td>???????????????:</td>
					<td><input type="text" name="phone" class="box"></td>
				</tr>
				<tr>
					<td><span>*</span></td>
					<td>??????:</td>
					<td>
					<input type="text" name="addr" class="box1"><br>        
					<input type="text" name="addr2"><br>
					<input type="text" name="addrDetail"> 
					<input type="text" name="addrExtra">
						
						</td>
				</tr>
                  </table>  
                  </div>
                  </form>
                  <%@ include file="../header/footer.jsp"%>
                  </html>
                  

                  
                  
                  
                  