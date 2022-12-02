/**
 * 
 */

$(document).ready(function(){       // 합계를 구하는함수
	var pno = $(".pno");
	for(var i=0; i<pno.length;i++){
		total(pno[i].value)
	}
	
	// 선택 한 번호 저장할 배열
	   var checkedNum = [];
	// 로그인 한 ID 저장하는 변수
	   var loginId = $("#loginId").val();

	   
	// 번호 체크 변할 때
	   $(".chkbox").change(function(){
	      var str="";
	      
	       if($(this).is(":checked")){                  
	    	   checkedNum.push($(this).val());
	    	   
	       }else{                     	           
	    	   checkedNum = checkedNum.filter(item => item != $(this).val());
	    	  
	       }
	   });

	$("#order_btn").on("click",function(){
		if($("#login").val()=="login"){
			alert("로그인 해주세요.");
			return false;
		}
		
		location.href = "/Purchase/Purchase?pno="+checkedNum;

       });

});




function change(pno) { // 수량 변경 하기 위한 함수
	var quantitiy = $("#quantitiy" + pno).val();
	console.log(pno, quantitiy);

	$.ajax({
		type : "post",
		url : "/basket",
		data : {
			pno : pno,
			quantitiy : quantitiy
		},
		success : function(result) {

			if (result == "success") {
				alert("변경되었습니다");
			}
		}
	})
}

function remove(pno) { // 장바구니 삭제를 위한 함수
	var quantitiy = $("#quantitiy" + pno).val();
	console.log(pno, quantitiy);

	$.ajax({
		type : "post",
		url : "/remove",
		data : {
			pno : pno,
			quantitiy : quantitiy
		},
		success : function(result) {
			if (result == "success") {
				alert("삭제되었습니다");
				window.location.replace("/pay/basket")
			}
		}
	})

}
function total(pno) {              // 합계를 구하는함수
	var uniprice = $("#uniprice" + pno).val()
	var quantitiy = $("#quantitiy" + pno).val()
	console.log(uniprice);
	$("#sum" + pno).val(uniprice * quantitiy)
}


function selectAll(selectAll)  {      // 체크박스 전체 선택하는 함수
	  const checkboxes 
	       = document.getElementsByName('chkbox');
	  
	  checkboxes.forEach((checkbox) => {
	    checkbox.checked = selectAll.checked;
	  })
	  // 선택된 목록 가져오기
	  const query = 'input[name="chkbox"]:checked';
	  const selectedElements = 
	      document.querySelectorAll(query);
	  
	  // 선택된 목록의 갯수 세기
	  const selectedElementsCnt =
	        selectedElements.length;
	  
	  // 출력
	  document.getElementById('result').innerText
	    = selectedElementsCnt;
	  
	  // 총 상품가격을 구하는 함수
	  var chkbox = document.querySelectorAll('.chkbox')
		 var total=0;
		 for(var i=0; i< chkbox.length; i++){
		 if(chkbox[i].checked){
			 total += parseInt($("#sum"+chkbox[i].value).val());
		       }
		     }
		 document.getElementById('itemSum1').innerText = total;
	  
		// 총 결제 예상 금액을 구하는 함수
		 var chkbox = document.querySelectorAll('.chkbox')
		 var total=0;
		 for(var i=0; i< chkbox.length; i++){
		 if(chkbox[i].checked){
		 total += parseInt($("#sum"+chkbox[i].value).val());
		       }
		     }
		 document.getElementById('itemSum').innerText = total +3000;
		 
		 // 수량 나타내는것
		 var chkbox = document.querySelectorAll('.chkbox')
		 var total=0;
		 for(var i=0; i< chkbox.length; i++){
		 if(chkbox[i].checked){
		 total += parseInt($("#quantitiy"+chkbox[i].value).val());
		       }
		     }
		 document.getElementById('itemSum2').innerText = total;
		 
		 } 

          
	
	
function itemSum(pno){                     // 체크박스 선택시 몇건을 선택한지 표현하는 함수
	  // 선택된 목록 가져오기
	  const query = 'input[name="chkbox"]:checked';
	  const selectedElements = 
	      document.querySelectorAll(query);
	
	  
	  // 선택된 목록의 갯수 세기
	  const selectedElementsCnt =
	        selectedElements.length;
	  
	  // 출력
	  document.getElementById('result').innerText
	    = selectedElementsCnt;
	  
	  // 총 상품가격을 구하는 함수
	  var chkbox = document.querySelectorAll('.chkbox')
		 var total=0;
		 for(var i=0; i< chkbox.length; i++){
		 if(chkbox[i].checked){
		 total += parseInt($("#sum"+chkbox[i].value).val());
		       }
		     }
		 document.getElementById('itemSum1').innerText = total;
	  
	  // 총 결제 예상 금액을 구하는 함수
		 var chkbox = document.querySelectorAll('.chkbox')
		 var total=0;
		 for(var i=0; i< chkbox.length; i++){
		 if(chkbox[i].checked){
		 total += parseInt($("#sum"+chkbox[i].value).val());
		       }
		     }
		 document.getElementById('itemSum').innerText = total + 3000;
		 
		 // 수량 나타내는것
		 var chkbox = document.querySelectorAll('.chkbox')
		 var total=0;
		 for(var i=0; i< chkbox.length; i++){
		 if(chkbox[i].checked){
		 total += parseInt($("#quantitiy"+chkbox[i].value).val());
		       }
		     }
		 document.getElementById('itemSum2').innerText = total;
		 
		 } 
	

function delivery_price(number) {
    return number.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}









