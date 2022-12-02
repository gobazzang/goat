<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link rel="stylesheet"
	href="../../../resources/CSS/outwearlist.css?version=1.3" type="text/css">
<script type="text/javascript" src="../../../resources/JS/quantity.js"></script>
<script type="text/javascript" src="../../../resources/JS/review.js"></script>
</head>
<body>
<div id="container">
<%@ include file="../header/header.jsp"%>
<form action="/list/outwearlist" id="form" method="post">
<div class ="left">
    <img src="../../../resources/image/shoes1-1.jpg" alt="" id="img1" name="filename">
</div>
<div class ="right">
    <div class="top">
       <dl>
       <dt>상품명</dt>
       <dd class="pname" id="pname"><input type="text" id="pname1" style="border: none; background: transparent;"  name="pname" readonly value="FLIP FLOP (5COLOR)"></dd>
       <dt>판매가</dt>
        <dd class="price" id="uniprice"><input type="text" id="uniprice1" style="border: none; background: transparent;" name="uniprice" readonly value="34000"></dd>
       <dt>상품간략 설명</dt>
           <dd>  - 베이직한 디자인의 데일리 플립 플랍</dd>
           <dd>  - 편안한 쿠션감</dd>
           <dd>  - 우수한 복원력</dd>
           <dd>  - 유행에 상관없이 오랫동안 착용 가능</dd>
           <dd></dd>
           <dd></dd>
       <dt></dt>
       <dd>FABRIC :  </dd>
       <dt></dt>
       <dd>FITTING SIZE : BOY (280)</dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd>SIZE INFO</dd>
       <dt></dt>
       <dd>굽 높이 : 3.5cm</dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd>* 사이즈 실측은 1~3cm정도 차이가 날 수 있습니다</dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd>* 정사이즈로 추천드립니다.</dd>
       </dl>
       
     <div class="number">
         
             <div class="COLOR">
               COLOR
             	  <select class="COLOR" name="category" id="coloroption">
             	        <option value="OPTION">-[필수]옵션을 선택해 주세요-</option>
             	        <option value="----">---------------</option>
             	        <option value="WHITE">WHITE</option>
             	        <option value="BEIGE">BEIGE</option>
						<option value="KHAKI">KHAKI</option>
						<option value="ORANGE">ORANGE</option>
						<option value="BLACK">BLACK</option>
				  </select>
				  
				  
			 <div class="SIZE">
             SIZE
               <select class="SIZE" name="category" id="sizeoption">
                        <option value="OPTION">-[필수]옵션을 선택해 주세요-</option>
             	        <option value="----">---------------</option>
						<option value="250">250</option>
						<option value="260">260</option>
						<option value="270">270</option>
						<option value="280">280</option>
						
				  </select>
				  </div>
				  </div>
				  
				    <div class="order_number"> 
           <div id = "re">
               수량:<select id="quantity1" onchange="total()" name="quantitiy">
               <option value="OPTION">0</option>
               <option value="1" >1</option>
               <option value="2" >2</option>
               <option value="3" >3</option>
               <option value="4" >4</option>
               <option value="5" >5</option>
               <option value="6" >6</option>
               <option value="7" >7</option>
               <option value="8" >8</option>
               <option value="9" >9</option>
              </select>
           </div>
           <input type="hidden" name="price" id="price" value="34000">  
             </div>
       </div>
       <div class ="total_price">
         총 상품금액:<span id ="total"></span>
       </div>
       <div class="bottom">
           <button type="button" id="order_btn">주문하기</button>
           <button type="button" id="uploadBtn">장바구니</button>
           <button type="button" id="like_btn">찜하기</button>
       </div>
    </div>
</div>
</form>
</div>


       <div>
    <img src="../../../resources/image/shoes-1-2.jpg" alt="" id="img1-1">
      </div>  
       <div>
    <img src="../../../resources/image/shoes-1-3.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-4.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-5.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-6.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-7.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-8.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-9.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/shoes-1-10.jpg" alt="" id="img1-1">
      </div> 
    *review
    <div class ="review">
    <div class="review1">
    <img src="../../../resources/image/review.png" alt="" >
    <div id="review1">
      리뷰를 작성하세요
    </div> 
     <form action="/list/outwearlist1" id="form1" method="post">
     <div id="review_btn">
     <button type="button" id="review_btn">작성</button>
     <input type="hidden" id="pname"  name="pname"  value="FLIP FLOP (5COLOR)">
    </div>
    </form>
    </div>
    </div>
       <%@ include file="../header/footer.jsp"%>
</body>
</html>


