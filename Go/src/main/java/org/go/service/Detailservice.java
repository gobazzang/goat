package org.go.service;

import org.go.model.AttachFileVO;
import org.go.model.BoardVO;

public interface Detailservice {
	
		   // 글 상세 내용 보기 설계 
		   public BoardVO detail(BoardVO board);
		   // 글 수정 설계
		   public int modify(BoardVO board); 
		   // 글 삭제 설계 
		   public void remove(BoardVO board);
		   
		   // 첨부파일 조회 설계
		   // public ArrayList<AttachFileVO> attachlist (int bno);
		   public AttachFileVO attachlist (int bno);
		   
		   public void attachremove(AttachFileVO attach);
}
