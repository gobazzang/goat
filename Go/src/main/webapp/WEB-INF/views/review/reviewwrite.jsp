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
	<script type="text/javascript" src="../../../resources/JS/mypagesignup.js?version=1.2"></script>
	<link rel="stylesheet" href="../../../resources/CSS/reviewwrite.css?version=1.2" type="text/css">
	<link rel="stylesheet" href="../../../resources/CSS/write.css?version=1.7" type="text/css">
	<script type="text/javascript" src="../../../resources/JS/uploadAjax1.js"></script>
    <script type="text/javascript" src="../../../resources/JS/writeAttach.js?version=1.7"></script>
</head>
<body>
<%@ include file="../header/header.jsp"%>
리뷰 글작성
    <div id="content">
    <form action="/review/reviewwrite" method="post"
			onsubmit="return jsSubmit();">
			<input type="text" name="id" value="${id}" hidden="true">
		<div id="middle">	
	    <table id="ta1" >
				<c:forEach items="${reviewwrite}" var="review">
               <tr>
               <td><span>*</span></td>
               <td>상품명:</td>
               <td class="pname" id="pname"><input type="text" name="pname" id="pname1" value="${review.pname}"class="box" style="border: none; background: transparent;" readonly></td> 
               </tr>
               </c:forEach>
              </table>
              </div>
              </form>
                  </div>
                  <form action="/review/reviewwrite" id="form" method="post">
			<div id="mid"> 
				<table>
					<tr>
						<td>
							<div id="select">
								<select name="category">
									<option value="outwear">OUTWEAR</option>
									<option value="top">TOP</option>
									<option value="bottom">BOTTOM</option>
									<option value="headwear">HEADWEAR</option>
									<option value="bag">BAG</option>
									<option value="shoes">SHOES</option>
									<option value="eyewear">EYEWEAR</option>
									<option value="acc">ACC</option>
								</select>
							</div>
						</td>
						<td><input type="text" name="title" id="uploadtitle"
							placeholder="제목을 입력하세요" maxlength="40"></td>
					</tr>
				</table>
					
						<div id="uploadResult" contentEditable="true"  style="min-height:500px; height:auto;">		
						</div>
					
				<table>
					<tr>
						<td><label> 파일첨부 <input type="file" name="uploadFile"
								id="uploadFile" hidden="" multiple>
						</label></td>
						<td style="text-align: left"><div id="uploadResult2"></div></td>
					</tr>
				</table>
				<div id="button">
					<input type="button" id="uploadBtn" value="작성" class="button">
					<a href="../review/review"><input type="button" value="취소" class="button"></a>
				</div>
			</div>
			<div id="bottom"></div>
		</form>
             
   <%@ include file="../header/footer.jsp"%>
</body>
</html>