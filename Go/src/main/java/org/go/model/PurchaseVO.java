package org.go.model;

public class PurchaseVO {
	
	private int pno;
	private String pname;      //상품명
	private Integer uniprice;  //상품가격
	private String category;   //분류
	private int quantitiy;     //장바구니 담은 개수
	private String id;
	private Integer total;
	private String name;
	private String phone;
	private String addr;
	
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
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
	public int getQuantitiy() {
		return quantitiy;
	}
	public void setQuantitiy(int quantitiy) {
		this.quantitiy = quantitiy;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Purchase [pno=" + pno + ", pname=" + pname + ", uniprice=" + uniprice + ", category=" + category
				+ ", quantitiy=" + quantitiy + ", id=" + id + ", total=" + total + ", name=" + name + ", phone=" + phone
				+ ", addr=" + addr + "]";
	}
	
	
	
	
}
