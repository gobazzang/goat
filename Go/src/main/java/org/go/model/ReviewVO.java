package org.go.model;

import java.util.ArrayList;

public class ReviewVO {
	
	private String pname;
	
	private String id;
	
	private int rno;
	
	private String title;
	
	private String content;
	
	private String regdate;
	
	private int cnt;
	
	private int good;
	
	private String category;
	
	private String filePath;

	private int cnthno;

	private int cntrno;
	
	private int bno;
	
	private String nick;
	
	// AttachFileVO(파일 업로드 관련 model)
	private ArrayList<AttachFileVO> attach;

	
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public int getGood() {
		return good;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getCnthno() {
		return cnthno;
	}

	public void setCnthno(int cnthno) {
		this.cnthno = cnthno;
	}

	public int getCntrno() {
		return cntrno;
	}

	public void setCntrno(int cntrno) {
		this.cntrno = cntrno;
	}

	public ArrayList<AttachFileVO> getAttach() {
		return attach;
	}

	public void setAttach(ArrayList<AttachFileVO> attach) {
		this.attach = attach;
	}

	@Override
	public String toString() {
		return "ReviewVO [pname=" + pname + ", id=" + id + ", rno=" + rno + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", cnt=" + cnt + ", good=" + good + ", category=" + category + ", filePath="
				+ filePath + ", cnthno=" + cnthno + ", cntrno=" + cntrno + ", bno=" + bno + ", nick=" + nick
				+ ", attach=" + attach + "]";
	}




	

	
	
	

}
