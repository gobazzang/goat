/**
 * 
 */

$(document).ready(function(){	
	
	$("#review_btn").on("click",function(){
		if($("#login").val()=="login"){
			alert("로그인 해주세요.");
			return false;
		}
		
		$("#form1").submit();
		
	});
	
	
	
	
	
	
	
});