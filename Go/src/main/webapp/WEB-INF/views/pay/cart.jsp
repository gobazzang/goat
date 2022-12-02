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
	<meta name="viewport" content="width=device-width">
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.3/css/all.css" integrity="sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/" crossorigin="anonymous">
	<link rel="stylesheet" href="../../../resources/CSS/10-11.css?version=1.9">
	<script type="text/javascript" src="../../../resources/JS/10-11.js?version=1.2"></script>  
</head>
<body>
<%@ include file="../header/header.jsp"%>

카트 목록 리스트
       <form action="/pay/basket" id="orderform" name="orderform" 
     method="post" class="orderform" onsubmit="return jsSubmit();">
    
            <input type="text" name="id" value="${id}" hidden="true">
            <div class="basketdiv" id="basket">
                <div class="row head">
                    <div class="subdiv">
                        <div class="check">선택</div>
                        <div class="pname">상품명</div>
                    </div>
                    <div class="subdiv">
                        <div class="uniprice" id="uniprice">가격</div>
                        <div class="quantitiy"  id="quantitiy" >수량</div>
                        <div class="sum">합계</div>
                    </div>
                    <div class="subdiv">
    
                        <div class="basketcmd">삭제</div>
                    </div>
                    <div class="split"></div>
                </div>
        <c:forEach items="${basket}" var="basketlist">
                <div class="row data">
                    <div class="subdiv">
                        <div class="check"><input type="checkbox" name="buy" value="260" checked="" onclick="javascript:basket.checkItem();">&nbsp;</div>
                        
                        <div class="pname">
                            <span id="pname">${basketlist.pname}</span>
                        </div>
                    </div>
                    <div class="subdiv">
                        <div class="uniprice"><input type="hidden" name="p_price" id="p_price1" class="p_price" value="${basketlist.uniprice}"></div>
                        <div class="quantitiy">
                            <div class="updown">
                                <input type="text" name="p_num1" id="p_num1" size="2" maxlength="4" class="p_num" value="${basketlist.quantitiy}" onkeyup="javascript:basket.changePNum(1);">
                                <span onclick="javascript:basket.changePNum(1);" class="backbtn1"><i class="fas fa-arrow-alt-circle-up up"></i></span>
                                <span onclick="javascript:basket.changePNum(1);" class="backbtn1"><i class="fas fa-arrow-alt-circle-down down"></i></span>
                            </div>
                        </div>
                        <div class="sum"></div>
                    </div>
                    <div class="subdiv">
                        <div class="basketcmd"><input type="submit" value="삭제" formaction="/pay/remove" class="remove" name="remove"></div>
                    </div>
                </div>
             </c:forEach>
            <div class="right-align basketrowcmd">
                <a href="javascript:void(0)" class="abutton" onclick="javascript:basket.delCheckedItem();">선택상품삭제</a>
                <a href="javascript:void(0)" class="abutton" onclick="javascript:basket.delAllItem();">장바구니비우기</a>
            </div>
    
            <div class="bigtext right-align sumcount" id="sum_p_num">상품갯수: 0개</div>
            <div class="bigtext right-align box blue summoney" id="sum_p_price">합계금액:원</div>
    
            <div id="goorder" class="">
                <div class="clear"></div>
                <div class="buttongroup center-align cmd">
                    <a href="javascript:void(0);">선택한 상품 주문</a>
                </div>
            </div>
            </div>
        </form>

</body>
</html>




