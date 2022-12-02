/**
 * 
 */



$(document).ready(function(){
	
	 // 선택된 목록 가져오기
	  const query = 'input[name="pno"]';
	  const selectedElements = 
	      document.querySelectorAll(query);
	
	  
	  // 선택된 목록의 갯수 세기
	  const selectedElementsCnt =
	        selectedElements.length;
	  
	  // 출력
	  document.getElementById('result').innerText
	    = selectedElementsCnt;
	  
	  // 총 결제 예상 금액을 구하는 함수
		 var pno = document.querySelectorAll('.pno')
		 var total=0;
		 for(var i=0; i< pno.length; i++){
		 if(pno[i]){
		 total += parseInt($("#sum"+pno[i].value).val());
		       }
		     }
		 document.getElementById('itemSum').innerText = total + 3000;
	  
		 // 수량 나타내는것
		 var pno = document.querySelectorAll('.pno')
		 var total=0;
		 for(var i=0; i< pno.length; i++){
		 if(pno[i]){
		 total += parseInt($("#quantitiy"+pno[i].value).val());
		       }
		     }
		 document.getElementById('itemSum2').innerText = total;
		 
	
	
	
	
	$('#selectPay_new').hide();   // 초깃값 설정
	
	
$("input[name='payment']").change(function(){
	if($("input[name='payment']:checked").val() == '신규 배송지 정보'){
		$('#selectPay_card').hide();
		$('#selectPay_noBank').hide();
		$('#selectPay_new').show();
	}	
			
});
});


