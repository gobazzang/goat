package org.go.mapper;

import java.util.ArrayList;

import org.go.model.PurchaseVO;

public interface OrderlistMapper {

	
	public ArrayList<PurchaseVO> orderlist(String id);
}
