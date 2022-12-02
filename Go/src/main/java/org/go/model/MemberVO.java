package org.go.model;

public class MemberVO {
private String id;
	
	private String password;
	
	private String nick;
	
	private String addr;
	
	private String addr2;
	
	private String addrDetail;
	
	private String addrExtra;
	
	private String phone;
	
	private String email;
	
	private String name;
	
	private String memdate;
	
	private String birth;
	
	private int cnt;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemdate() {
		return memdate;
	}

	public void setMemdate(String memdate) {
		this.memdate = memdate;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddrDetail() {
		return addrDetail;
	}

	public void setAddrDetail(String addrDetail) {
		this.addrDetail = addrDetail;
	}

	public String getAddrExtra() {
		return addrExtra;
	}

	public void setAddrExtra(String addrExtra) {
		this.addrExtra = addrExtra;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", password=" + password + ", nick=" + nick + ", addr=" + addr + ", addr2="
				+ addr2 + ", addrDetail=" + addrDetail + ", addrExtra=" + addrExtra + ", phone=" + phone + ", email="
				+ email + ", name=" + name + ", memdate=" + memdate + ", birth=" + birth + ", cnt=" + cnt + "]";
	}



}
