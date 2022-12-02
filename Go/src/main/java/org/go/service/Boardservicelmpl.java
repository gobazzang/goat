package org.go.service;

import java.util.ArrayList;

import org.go.service.Boardservice;
import org.go.mapper.BoardAttachMapper;
import org.go.mapper.BoardMapper;
import org.go.model.BoardVO;
import org.go.model.CriteriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Boardservicelmpl implements Boardservice {
	@Autowired
	BoardMapper bm;
	@Autowired
	BoardAttachMapper bam;

	// 글쓰기 설계도를 보고 구현하기
	public void boardwrite(BoardVO board) {
		bm.boardwrite(board);
		System.out.println("bno"+board.getBno());
		System.out.println("첨부파일"+board.getAttach());
		if (board.getAttach() != null) {
			board.getAttach().forEach(attach -> {
				attach.setBno(board.getBno());
				bam.insert(attach);
			});
		}
	}
	


//	public ArrayList<BoardVO> list(){
//		return bm.list();
//	}

//	public BoardVO detail(BoardVO board){
//		return bm.detail(board);
//	}

//	public void modify(BoardVO board) {
//		bm.modify(board);
//	}

//	public void remove(BoardVO board) {
//		bm.delete(board);
//	}
	public ArrayList<BoardVO> search(CriteriaVO cri) {
		return bm.search(cri);
	}

	public int total(CriteriaVO cri) {
		return bm.total(cri);
	}
}
