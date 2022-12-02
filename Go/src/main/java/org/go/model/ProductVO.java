package org.go.model;

public class ProductVO {
	private String productId;  //상품아이디
	private String pname;      //상품명
	private Integer uniprice;  //상품가격
	private String category;   //분류
	private String filename;   //이미지 파일명
	private int quantitiy;     //장바구니 담은 개수
	private String id;
	private int pno;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Integer getUniprice() {
		return uniprice;
	}
	public void setUniprice(Integer uniprice) {
		this.uniprice = uniprice;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public int getQuantitiy() {
		return quantitiy;
	}
	public void setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
	}
	
	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", pname=" + pname + ", uniprice=" + uniprice + ", category="
				+ category + ", filename=" + filename + ", quantitiy=" + quantitiy + ", id=" + id + ", pno=" + pno
				+ "]";
	}
	
	}
	
	
	
	
	
	
	
	

