package org.go.service;

import java.util.ArrayList;
import org.go.model.ProductVO;
import org.go.model.ReviewVO;
import org.go.model.BoardVO;
import org.go.model.CriteriaVO;

public interface Listservice {
	// 전체 글 목록 리스트 설계
	public ArrayList<BoardVO> list(CriteriaVO cri);

	// 매니저 글 목록 리스트 설계
	public ArrayList<BoardVO> manager();
	
	// board 테이블 전체건수 설계
	public int total(CriteriaVO cri);

	// 이미지가 있는 게시글 목록 리스트 설계
	public ArrayList<BoardVO> imglist(CriteriaVO cri);
	
	// board 테이블 이미지 전체건수 설계
	public int imgtotal(CriteriaVO cri);

	

	public void outwearlist(ProductVO pro);
	
	public void outwearlist1(ReviewVO rv);

}
