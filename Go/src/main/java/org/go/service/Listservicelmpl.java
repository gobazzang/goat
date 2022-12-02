package org.go.service;

import java.util.ArrayList;

import org.go.mapper.ListMapper;
import org.go.model.ProductVO;
import org.go.model.ReviewVO;
import org.go.model.BoardVO;
import org.go.model.CriteriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Listservicelmpl implements Listservice {

	@Autowired
	ListMapper lm;
	
	
	// ListService에서 설계되어 진 list 추상메서드를  구현
		public ArrayList<BoardVO> list(CriteriaVO cri){
			return lm.list(cri);
		}
		
		// 매니저 글 목록 리스트 설계
		public ArrayList<BoardVO> manager(){
			return lm.manager();
		}
		
		// ListService에서 설계되어 진 total 추상메서드를 구현
		public int total(CriteriaVO cri) {
			return lm.total(cri);
		}
		
		// 이미지가 있는 게시글 목록 리스트 설계
		public ArrayList<BoardVO> imglist(CriteriaVO cri){		
			return lm.imglist(cri);
		}

		// board 테이블 이미지 전체건수 설계
		public int imgtotal(CriteriaVO cri) {
			return lm.imgtotal(cri);
		}
		
		public void outwearlist(ProductVO pro){
			lm.outwearlist(pro);
		}
		
		public void outwearlist1(ReviewVO rv){
			lm.outwearlist1(rv);
		}
	
}
