package org.go.service;

import java.util.ArrayList;

import org.go.service.Managerservice;
import org.go.mapper.ManagerMapper;
import org.go.model.BoardVO;
import org.go.model.CriteriaVO;
import org.go.model.MemberVO;
import org.go.model.PurchaseVO;
import org.go.model.RepleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Managerservicelmpl implements Managerservice {

	@Autowired
	ManagerMapper mm;

	// BoardService에서 설계되어진 list추상메서드를 구현
	public ArrayList<MemberVO> list(CriteriaVO cri) {
		return mm.list(cri);
	}
	
	// 멤버 리스트에서 전체 회원수 조회
	public int total(CriteriaVO cri){
		return mm.total(cri);	
	}
	
/*	// 멤버 리스트에서 아이디 검색
	public MemberVO memsearch(MemberVO member) {
		return mm.memsearch(member);
	}
*/

    // 멤버 상세 페이지 설계
	public MemberVO memdetail(MemberVO member) {

		return mm.memdetail(member);
	}

	// 멤버 삭제
	public void remove(MemberVO remove) {
		mm.remove(remove);
	}

	// 작성 글 리스트
	public ArrayList<BoardVO> WriteList(CriteriaVO cri) {
		return mm.WriteList(cri);
	}
	
	// 작성 글 리스트에서 전체 게시물수 조회
	public int boardtotal(CriteriaVO cri) {
		return mm.boardtotal(cri);
	}

	// 글 삭제
	public void bremove(BoardVO bremove) {
		mm.bremove(bremove);
	}

	// 댓글 리스트
	public ArrayList<RepleVO> RepleList(CriteriaVO cri) {
		return mm.RepleList(cri);
	}
	
	// 댓글 리스트에서 전체 댓글수 조회
	public int repletotal(CriteriaVO cri) {
		return mm.repletotal(cri);
	}
	
	// 댓글 삭제
	public void repleremove(RepleVO remove) {
		mm.repleremove(remove);
	}
	
	public ArrayList<PurchaseVO> orderlist1(String id) {
		return mm.orderlist1(id);
	}
	/*
	 * 글 수정 public void modify(BoardVO board) { mm.modify(board); }
	 */

}
