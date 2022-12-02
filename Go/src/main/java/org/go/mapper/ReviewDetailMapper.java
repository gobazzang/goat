package org.go.mapper;

import org.go.model.BoardVO;
import org.go.model.ReviewVO;

public interface ReviewDetailMapper {
	// 목록에서 제목을 클릭한 후 상세 내용을 조회하는 DB작업 설계 
	   public ReviewVO reviewdetail(ReviewVO rev);
	// 목록에서 제목을 클릭한 후 상세 내용을 조회할 때 조회수도 같이 update하는 DB작업 설계
	   public void cntup(ReviewVO rev);
	   
	// 상세내용에 해당되는 내용을 수정하는 DB작업 설계 
	    public int modify(ReviewVO rev);   
	// 상세내용에 해당되는 내용을 삭제하는 DB작업 설계
	    public void remove(ReviewVO rev);

}
