$(document).ready(function() {
        $('#summernote').summernote({
            /* 폰트선택 툴바 사용하려면 주석해제 */
            // fontNames: ['Roboto Light', 'Roboto Regular', 'Roboto Bold', 'Apple SD Gothic Neo'],
            // fontNamesIgnoreCheck: ['Apple SD Gothic Neo'],
            placeholder: 'TIP 게시글을 입력해 주세요',
            tabsize: 2,
            height: 570,
            resize: false,
            lang: "ko-KR",
            disableResizeEditor: true,
            toolbar: [
                /* 폰트선택 툴바 사용하려면 주석해제 */
                // ['fontname', ['fontname']],
                ['fontsize', ['fontsize']],
                ['style', ['bold', 'italic', 'underline', 'clear']],
                ['color', ['color']],
                ['table', ['table']],
                ['para', ['paragraph']],
                ['insert', ['link', 'picture']],
                ['view', []]
            ],
            callbacks: {	//여기 부분이 이미지를 첨부하는 부분
                onImageUpload: function (files) {
                    RealTimeImageUpdate(files, this);
                }
            }
        });
        /* 초기 셋팅 ( etc -> 게시글 수정 or Default font family ) */
        $('#summernote').summernote('code', "<?php echo $positing_text ?>");
        $('.note-current-fontname').css('font-family','Apple SD Gothic Neo').text('Apple SD Gothic Neo');
        $('.note-editable').css('font-family','Apple SD Gothic Neo');

        $(".note-group-image-url").remove();    //이미지 추가할 때 Image URL 등록 input 삭제 ( 나는 필요없음 )

        $("#submit-btn").click(function(){
            var text = $('#summernote').summernote('code');

        });
    	// 파일 전송번튼(id="uploadBtn")을 클릭하면
    	$("#uploadBtn").on("click",function(){
    		alert("aaaa");
    		
    		// 파일 업로드 관련 로직 처리
    		var formData = new FormData();
    		
    		var inputFile = $("input[name='uploadFile']");
    		// console.log(inputFile);
    		var files = inputFile[0].files;
    		
    		console.log(files);
    		
    		for(var i=0; i<files.length; i++){
    			// 함수 호출(checkExtension)
    			if(!checkExtension(files[i].name, files[i].size)){
    				return false;
    			}
    			
    			// .jsp 의 파일선택을 통해 선택한 파일들을 form태그에 추가
    			formData.append("uploadFile", files[i]);
    		}
    		
    		// ajax를 통해서 UploadController에 파일 관련 데이터 전송.
    		$.ajax({
    			type : "post",
    			url : "/uploadAjaxAction",
    			data : formData,
    			contentType : false,
    			processData : false,
    			dataType : "json",
    			success : function(result){
    				console.log(result);
    				
    				var str = "";
    				var input = "";
    				$(result).each(function(i, obj){	// result가 배열이면 each(for) i가 인덱스 번호, obj[i]
    					input +="<input type='text' name='attach["+i+"].fileName' value='" + obj.fileName+"'>";
    					input +="<input type='text' name='attach["+i+"].uuid' value='" + obj.uuid+"'>";
    					input +="<input type='text' name='attach["+i+"].uploadPath' value='" + obj.uploadPath+"'>";
    					input +="<input type='text' name='attach["+i+"].image' value='" + obj.image+"'>";
    					// 만약 image 결과가 true면
    					if(obj.image){
    						// 아래에 있는거 실행
    						var filePath = encodeURIComponent(obj.uploadPath+"/s_"+obj.uuid+"_"+obj.fileName);
    						console.log(filePath);
    					
    						str+="<img src='display?fileName="+filePath+"'>"+obj.fileName;
    					}else{	// 그렇지 않으면
    						// 다운로드 할 수 있도록 실행
    						var filePath = encodeURIComponent(obj.uploadPath+"/"+obj.uuid+"_"+obj.fileName);
    						str += "<a href='/download?fileName="+filePath+"'>"+obj.fileName+"</a>";
    					}
    				})
    				
    				$("#uploadResult ul").html(str);
    				$("#form").append(input).submit();
    			}
    		})
    	})
 
        /*
         - 이미지 추가 func
         - ajax && formData realtime img multi upload
        */
        function RealTimeImageUpdate(files, editor) {
            var formData = new FormData();
            var fileArr = Array.prototype.slice.call(files);
            fileArr.forEach(function(f){
                if(f.type.match("image/.jpg") || f.type.match("image/.jpeg" || f.type.match("image/.jpeg"))){
                    alert("JPG, JPEG, PNG 확장자만 업로드 가능합니다.");
                    return;
                }
            });
            for(var xx=0;xx<files.length;xx++){
                formData.append("file[]", files[xx]);
            }

            $.ajax({
                url : "/uploadAjaxAction",
                data: formData,
                cache: false,
                contentType: false,
                processData: false,
                enctype	: 'multipart/form-data',
                type: 'POST',
                success : function(result) {

                    //항상 업로드된 파일의 url이 있어야 한다.
                    if(result === -1){
                        alert('이미지 파일이 아닙니다.');
                        return;
                    }
                    var data = JSON.parse(result);
                    for(x=0;x<data.length;x++){
                        var img = $("<img>").attr({src: data[x], width: "100%"});   // Default 100% ( 서비스가 앱이어서 이미지 크기를 100% 설정 - But 수정 가능 )
                        console.log(img);
                        $(editor).summernote('pasteHTML', "<img src='"+data[x]+"' style='width:100%;' />");
                    }
                }
            });
        }
    });
