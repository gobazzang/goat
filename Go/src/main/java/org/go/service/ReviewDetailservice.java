package org.go.service;

import org.go.model.AttachFileVO;
import org.go.model.BoardVO;
import org.go.model.ReviewVO;

public interface ReviewDetailservice {
	
	  // 글 상세 내용 보기 설계 
	   public ReviewVO reviewdetail(ReviewVO rev);
	   // 글 수정 설계
	   public int modify(ReviewVO rev); 
	   // 글 삭제 설계 
	   public void remove(ReviewVO rev);
	   
	   // 첨부파일 조회 설계
	   // public ArrayList<AttachFileVO> attachlist (int bno);
	   public AttachFileVO attachlist (int bno);
	   
	   public void attachremove(AttachFileVO attach);

}
