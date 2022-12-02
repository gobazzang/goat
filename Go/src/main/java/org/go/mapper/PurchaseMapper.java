package org.go.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;
import org.go.model.MemberVO;
import org.go.model.ProductVO;
import org.go.model.PurchaseVO;

public interface PurchaseMapper {
	
	public ArrayList<ProductVO> Purchase(@Param("id")String id,@Param("pno")String[] pno);
	
	public MemberVO detail(MemberVO member);
	
	public void Purchase1(PurchaseVO pu);
}
