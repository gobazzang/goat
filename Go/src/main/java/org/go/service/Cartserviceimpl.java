package org.go.service;

import java.util.ArrayList;

import org.go.mapper.CartMapper;
import org.go.model.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Cartserviceimpl implements Cartservice {

	@Autowired
	CartMapper cm;

	@Override
	public ArrayList<ProductVO> basket(String id) {
		return cm.basket(id);
	}

	@Override
	public int modify(ProductVO pro) {
		System.out.println(pro.getQuantitiy());
		int result = cm.modify(pro);

		return result;
	}

	public int remove(ProductVO pro) {
		int result = cm.remove(pro);
		return result;
	}
}
