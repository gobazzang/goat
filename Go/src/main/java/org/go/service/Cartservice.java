package org.go.service;



import java.util.ArrayList;
import org.go.model.ProductVO;

public interface Cartservice {

	public ArrayList <ProductVO> basket(String id);
	
	public int modify(ProductVO pro);
	
	public int remove(ProductVO pro);

}
