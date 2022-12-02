package org.go.service;

import org.go.mapper.BoardAttachMapper;
import org.go.mapper.ReviewDetailMapper;
import org.go.model.AttachFileVO;
import org.go.model.BoardVO;
import org.go.model.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewDetailservicelmpl implements ReviewDetailservice {
	
	@Autowired
	ReviewDetailMapper rdm;
	@Autowired
	BoardAttachMapper bam;   //attach 테이블 mapper
	
	   public ReviewVO reviewdetail(ReviewVO rev) {
		      rdm.cntup(rev);  
		     return rdm.reviewdetail(rev);   
		   }
	   
	   
		    public int modify(ReviewVO rev) {
		       
		      int result=rdm.modify(rev);
		       
		      System.out.println(rev.getRno());
		      System.out.println(rev.getAttach());
		      
		      if (rev.getAttach() != null) {
		    	  rev.getAttach().forEach(attach -> {
		            attach.setBno(rev.getRno());
		            bam.insert(attach);
		            });
		      }
		      
		      return result;
		   }
		   
		    public void remove(ReviewVO rev) {
		       rdm.remove(rev);
		    }
		    
		    // 첨부파일 조회 구현
		    // public ArrayList<AttachFileVO> attachlist(int bno){
		       public AttachFileVO attachlist(int bno){
		    	System.out.println("service attachlist==="+bno);
		       return bam.attachlist(bno);
		    }
		   
		   public void attachremove(AttachFileVO attach) {
		      
		      bam.attachremove(attach);
		   }

}
