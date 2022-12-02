/**
 * 
 */

 function submit2(frm) {
	console.log(frm)
    frm.action="/list/Purchase2"; 
    frm.submit(); 
    return true; 
  } 

$(document).ready(function(){
	

	//리스트 페이지로 이동
	$("#uploadBtn").on("click",function(){
		if($("#login").val()=="login"){
			alert("로그인 해주세요.");
			return false;
		}
		if($("#coloroption").val()=="OPTION"){
			alert("색상을 선택해주세요.");
			return false;
		}
		if($("#sizeoption").val()=="OPTION"){
			alert("사이즈를 선택해주세요.");
			return false;
		}
		
		if($("#quantity1").val()=="OPTION"){
			alert("수량을 선택해주세요.");
			return false;
		}
		
		
		$("#form").submit();
		


	});
	

});






function total(){
	var price = document.getElementById('price').value;
	var quantity1 = document.getElementById('quantity1').value;
	document.getElementById('total').innerText = price*quantity1;
}





