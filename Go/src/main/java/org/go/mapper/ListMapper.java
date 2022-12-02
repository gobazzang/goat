package org.go.mapper;

import java.util.ArrayList;

import org.go.model.ProductVO;
import org.go.model.ReviewVO;
import org.go.model.BoardVO;
import org.go.model.CriteriaVO;

public interface ListMapper {

	public void outwearlist(ProductVO pro);
	
	public void outwearlist1(ReviewVO rv);
	
	// 전체 게시글 목록 리스트에 해당되는 DB작업 설계
		public ArrayList<BoardVO> list(CriteriaVO cri);

		// 매니저 글 목록 리스트에 해당되는 DB작업 설계
		public ArrayList<BoardVO> manager();	
		
		// board 테이블 전체건수 DB설계
		public int total(CriteriaVO cri);

		// 이미지가 있는 게시글 목록 리스트에 해당되는 DB작업 설계
		public ArrayList<BoardVO> imglist(CriteriaVO cri);
		
		// board 테이블 이미지 전체건수 DB설계
		public int imgtotal(CriteriaVO cri);
}
