<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${reviewdetail.title} - ${reviewdetail.category}</title>

<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="../../../resources/JS/detail.js"></script>
<script type="text/javascript"
	src="../../../resources/JS/reple.js?version=1.1"></script>
<!--  <script type="text/javascript" src="/resources/JS/attach.js"></script> -->  
<!--  <script type="text/javascript" src="../../../resources/JS/uploadAjax.js"></script> -->
<script type="text/javascript"
	src="../../../resources/JS/writeAttach.js"></script>
<link rel="stylesheet"
	href="../../../resources/CSS/detail.css?version=1.2">

<script type="text/javascript" src="../../../resources/JS/like.js?version=1.0"></script>
</head>

<body>
 <%@ include file="../header/header.jsp"%>
   <div id="content">
      <form id="form">
         <input type="hidden" id="id" value="${id}"> 
         <input type="hidden" name="rno" value="${reviewdetail.rno}">
         <table border="1">
            <thead>
               <tr class="tr1">
                  <td colspan="4">
                     <c:choose>
                        <c:when test="${ id==null || id != reviewdetail.id}">
                           <textarea name="title" id="title" readonly>${reviewdetail.title}</textarea>
                        </c:when>
                        <c:otherwise>
                           <textarea name="title" id="title">${reviewdetail.title}</textarea>
                        </c:otherwise>
                     </c:choose> 
                     <span id="regdate"> ${reviewdetail.regdate}</span>
                  </td>
               </tr>
            </thead>

            <tbody>
               <tr class="tr1">
                  <td colspan="4">
                     <div class="side">
                        <span class="title_nick">${reviewdetail.nick}</span>
                     </div>

                     <div class="side_right">
                        ?????? ??? <span class="title_cnt">${reviewdetail.cnt}</span> <span
                           class="title_cnthno">?????? ??? <span class="cnthno">${reviewdetail.cnthno}</span></span>
                     </div>
                  </td>
               </tr>

               <tr>
                  <td colspan="4">




                        <c:choose>
                        <c:when test="${ id==null || id != reviewdetail.id}">
                     
                        <div id="uploadResult" contentEditable = "false">
                        <!-- ????????? ?????? ??????(textarea????????? ?????????????????? -->
                        <ul></ul>
                        	
                        </div>
                        
                        



                        <%-- <textarea name="content" id="contenttext1" readonly>${detail.content}</textarea> --%>

                        </c:when>
                        <c:otherwise>
                        
                        <div id="uploadResult"  contentEditable = "true">
                        <!-- ????????? ?????? ??????(textarea????????? ?????????????????? -->
                        <ul></ul>
                        </div>
                        
                        
                        
                     
                        <%-- <textarea name="content" id="contenttext1">${detail.content}</textarea> --%>
                       
                        
                        </c:otherwise>
                        </c:choose>
                  
                  </td>
               </tr>
            </tbody>
         </table>
         <div class="upload_file">
            <c:choose>
               <c:when test="${ id != null && id == reviewdetail.id}">

                  <div class="form-group uploadDiv">
                     <label> ?????? ?????? <input type="file" name="uploadFile"
                        id="uploadFile" hidden="" multiple>
                     </label>
                  </div>

                  <div id="uploadlist">
                     <span class="uploadlist">????????? ?????? ?????? : </span><input type="button"
                        value="?????? ?????????" id="addfile">

                     <!-- ????????? ??? ?????? ?????? -->
                     <ul></ul>
                     <!-- ????????? ??? ?????? ?????? -->
                     <div id="uploadResult2"></div>

                  </div>
                  <span class="modifybtn_box">
                  
                  <!-- <input type="submit" value="??????" formaction="/detail/modify" id="modify"> &nbsp;&nbsp; --> 
                  
                        <input type='button' value='??????' id="modify"> &nbsp;&nbsp; 
                        <input type="submit"value="??????" onclick="if(!confirm('?????? ?????????????????????????')){return false}" formaction="/detail/remove" class="remove">
                  </span>
               </c:when>

               <c:when test="${id eq 'manager'}">
                  <span class="modifybtn_box">
                     <input type="submit" value="??????" onclick="confirm('???????????? ?????? ????????????????')" formaction="/detail/remove" class="remove">
                  </span>
               </c:when>
            </c:choose>
         </div>
      </form>

      <div id="like">
         <button type="button" id="likeBtn">
            <p class="like_text">??? ???????????? ???????????????!</p>
            <br> <img src="../../../resources/image/star.png" id="likeImg"><span
               class="cnthno"> ${reviewdetail.cnthno}</span><br>
         </button>
      </div>
      <br>
      <div>
         <c:if test="${ id != null }">
            <div class="reply_box">
               <p>?????? ??????</p>
               <textarea rows="10" cols="140" id="reply"></textarea>

               <input type="hidden" value="${id}" id="replyid"> <input
                  type="button" value="??????" id="add">
            </div>
         </c:if>
      </div>


      <div id="chat">

         <table id="replyUL">

            <tr class="reple_nick">
               <td></td>
               <td></td>
            </tr>


            <tr class="reple_who">
               <td>
                  <div></div>
               </td>
            </tr>


         </table>
      </div>

      <div id="replePage"></div>
   </div>

   <%@ include file="../header/footer.jsp"%>

</body>
</html>