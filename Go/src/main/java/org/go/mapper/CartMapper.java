package org.go.mapper;



import java.util.ArrayList;

import org.go.model.ProductVO;

public interface CartMapper {

	public ArrayList<ProductVO> basket(String id);
	
	public int modify(ProductVO pro);
	
	public int remove(ProductVO pro);
}
