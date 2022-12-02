package org.go.service;

import java.util.ArrayList;

import org.go.model.PurchaseVO;

public interface Orderlistservice {

	
	public ArrayList<PurchaseVO> orderlist(String id);
}
