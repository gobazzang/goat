package org.go.service;

import java.util.ArrayList;

import org.go.mapper.PurchaseMapper;
import org.go.model.MemberVO;
import org.go.model.ProductVO;
import org.go.model.PurchaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Purchaseservicelmpl implements Purchaseservice  {

	
	@Autowired
	PurchaseMapper pm;
	
	
	@Override
	public ArrayList<ProductVO> Purchase(String id,String[] pno) {
		System.out.println(pno);
		System.out.println(id);
		return pm.Purchase(id,pno);
	}
	
	public MemberVO detail(MemberVO member) {
		//상세페이지 조회 할때
		//조회수 + 1 update
		//mm.cntup(member);
	  return pm.detail(member);
	}
	
	public void Purchase1(PurchaseVO pu) {
		pm.Purchase1(pu);
	}
}
