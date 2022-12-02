package org.go.service;

import java.util.ArrayList;

import org.go.mapper.OrderlistMapper;
import org.go.model.PurchaseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Orderlistservicelmpl implements Orderlistservice {

	
	@Autowired
	OrderlistMapper om;
	
	public ArrayList<PurchaseVO> orderlist(String id) {
		return om.orderlist(id);
	}
}
