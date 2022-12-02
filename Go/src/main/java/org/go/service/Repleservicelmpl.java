package org.go.service;

import org.go.service.Repleservice;
import org.go.mapper.RepleMapper;
import org.go.model.ReplePageVO;
import org.go.model.RepleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Repleservicelmpl implements Repleservice {
	
	@Autowired
	RepleMapper rm;
	
	// 댓글 쓰기를 위한 구현 
	public int writeReple(RepleVO reple) {
	
		return rm.writeReple(reple);
		
	}
	
	// 댓글 목록 리스트를 위한 구현
	/*public ArrayList<RepleVO> list(RepleVO reple){
		
		System.out.println("service="+reple);
		
		return ReplePageVO(rm.list(reple),rm.total(bno));
	}*/
    
	public ReplePageVO list(RepleVO reple,int bno){
		
		System.out.println("service="+reple);
		System.out.println("service="+bno);
		
		return new ReplePageVO(rm.rplcnt(bno), rm.list(reple, bno));
	}
	// 댓글 삭제를 위한 구현 
	public int remove(RepleVO reple) {
		return rm.remove(reple);
	}
	
	// 댓글 수정을 위한 구현
	public int modify(RepleVO reple) {
		
		return rm.modify(reple);
	}

}
