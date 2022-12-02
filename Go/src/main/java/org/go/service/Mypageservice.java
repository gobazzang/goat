package org.go.service;

import java.util.ArrayList;

import org.go.model.BoardVO;
import org.go.model.CriteriaVO;
import org.go.model.MemberVO;

public interface Mypageservice {

	
	public void mypagemypage(MemberVO member);

	public ArrayList<MemberVO> my(CriteriaVO cri);    //이거 추가된거 보기
	
	public MemberVO detail(MemberVO member);
	
	public void modify(MemberVO member);
	
	public void remove(MemberVO member);
	
	public int removechk(MemberVO member);
	
	public ArrayList<BoardVO> myboard(CriteriaVO cri );
	
	public int total(CriteriaVO cri);
}
