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
    <img src="../../../resources/image/headwear1-1.jpg" alt="" id="img1" name="filename">
</div>
<div class ="right">
    <div class="top">
       <dl>
       <dt>상품명</dt>
       <dd class="pname" id="pname"><input type="text" id="pname1" style="border: none; background: transparent;"  name="pname" readonly value="KNIT BALACLABA (6COLOR)"></dd>
       <dt>판매가</dt>
       <dd class="price" id="uniprice"><input type="text" id="uniprice1" style="border: none; background: transparent;" name="uniprice" readonly value="25000"></dd>
       <dt>상품간략 설명</dt>
           <dd>  - 탄탄한 니트 짜임</dd>
           <dd>  - 트렌디한 디자인</dd>
           <dd>  - 시즌 활용도가 높은 바라클라바</dd>
           <dd></dd>
           <dd></dd>
           <dd></dd>
       <dt></dt>
       <dd>FABRIC : ACRYLIC </dd>
       <dt></dt>
       <dd>FITTING SIZE : BOY(FREE),GIRL(FREE)</dd>
       <dt></dt>
       <dd>MODEL SIZE:BOY 177cm/67kg , GIRL 163cm/45kg</dd>
       <dt></dt>
       <dd>SIZE INFO</dd>
       <dt></dt>
       <dd> 길이 : 43cm</dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd>* 사이즈 실측은 1~3cm정도 차이가 날 수 있습니다</dd>
       <dt></dt>
       <dd></dd>
       <dt></dt>
       <dd>* 악세사리 제품은 교환 및 반품이 불가합니다.</dd>
       </dl>
       
     <div class="number">
         
             <div class="COLOR">
               COLOR
             	  <select class="COLOR" name="category" id="coloroption">
             	        <option value="OPTION">-[필수]옵션을 선택해 주세요-</option>
             	        <option value="----">---------------</option>
						<option value="LIGHT BLUE">IVORY</option>
						<option value="BEIGE">BEIGE</option>
						<option value="BLUE">BLUE</option>
						<option value="BROWN">GREEN</option>
						<option value="GRAY">GRAY</option>
						<option value="BLACK">BLACK</option>
				  </select>
				  
				  
			 <div class="SIZE">
             SIZE
               <select class="SIZE" name="category" id="sizeoption">
                        <option value="OPTION">-[필수]옵션을 선택해 주세요-</option>
             	        <option value="----">---------------</option>
						<option value="FREE">FREE</option>
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
           <input type="hidden" name="price" id="price" value="25000">  
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
    <img src="../../../resources/image/headwear1-2.jpg" alt="" id="img1-1">
      </div>  
      
       <div>
    <img src="../../../resources/image/headwear1-3.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-4.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-5.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-6.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-7.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-8.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-9.jpg" alt="" id="img1-1">
       </div>
       <div>
    <img src="../../../resources/image/headwear1-10.jpg" alt="" id="img1-1">
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
     <input type="hidden" id="pname"  name="pname"  value="KNIT BALACLABA (6COLOR)">
    </div>
    </form>
    </div>
    </div>
       <%@ include file="../header/footer.jsp"%>
</body>
</html>