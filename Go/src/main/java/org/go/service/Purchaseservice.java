package org.go.service;

import java.util.ArrayList;

import org.go.model.MemberVO;
import org.go.model.ProductVO;
import org.go.model.PurchaseVO;

public interface Purchaseservice {
	
	public ArrayList<ProductVO> Purchase(String id, String[] pno);

	public MemberVO detail(MemberVO member);
	
	public void Purchase1(PurchaseVO pu);
	
}
