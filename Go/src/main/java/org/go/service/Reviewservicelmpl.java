package org.go.service;

import java.util.ArrayList;

import org.go.mapper.BoardAttachMapper;
import org.go.mapper.ReviewMapper;
import org.go.model.ProductVO;
import org.go.model.ReviewVO;
import org.go.model.BoardVO;
import org.go.model.CriteriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Reviewservicelmpl implements Reviewservice {

	
	@Autowired
	ReviewMapper rm;
	
	@Autowired
	BoardAttachMapper bam;

	@Override
	public ArrayList<ProductVO> reviewwrite(String id) {
		return rm.reviewwrite(id);
	}
	
	// ListService에서 설계되어 진 list 추상메서드를  구현
		public ArrayList<BoardVO> review(CriteriaVO cri){
			return rm.review(cri);
		}
		
		// 매니저 글 목록 리스트 설계
		public ArrayList<BoardVO> manager(){
			return rm.manager();
		}
		
		// ListService에서 설계되어 진 total 추상메서드를 구현
		public int total(CriteriaVO cri) {
			return rm.total(cri);
		}
		
		// 이미지가 있는 게시글 목록 리스트 설계
		public ArrayList<BoardVO> imglist(CriteriaVO cri){		
			return rm.imglist(cri);
		}

		// board 테이블 이미지 전체건수 설계
		public int imgtotal(CriteriaVO cri) {
			return rm.imgtotal(cri);
		}
		
		public void reviewwrite1(ReviewVO rev) {
			rm.reviewwrite1(rev);
			System.out.println("bno"+rev.getRno());
			System.out.println("첨부파일"+rev.getAttach());
			if (rev.getAttach() != null) {
				rev.getAttach().forEach(attach -> {
					attach.setBno(rev.getRno());
					bam.insert(attach);
				});
			}
		}
	
	
	
	
	
}
