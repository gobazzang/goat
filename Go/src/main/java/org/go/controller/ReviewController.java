package org.go.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.go.model.PageVO;
import org.go.model.ReviewVO;
import org.go.service.Boardservice;
import org.go.service.Reviewservice;
import org.go.model.CriteriaVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ReviewController {
	
	@Autowired
	Reviewservice rs;
	
	@Autowired
	Boardservice bs;
	
	@RequestMapping(value = "/review/review", method = RequestMethod.GET)
	public String review(Model model, CriteriaVO cri) {
		System.out.println(cri);
		// list.jsp 실행 할 때 매니저글 select 된 결과를 가져가라.
		model.addAttribute("manager",rs.manager());
		// list.jsp 실행 할 때 select 된 결과를 가져가라.
		model.addAttribute("review", rs.review(cri));
		// list 폴더 안에 있는 list.jsp 실행 할 때 pageVO에 저장되어 있는 데이터를 가져와라.
		//							생성자 호출(매개변수가 없는 생성자)
		// int total = ls.total();
		int total = rs.total(cri);
		System.out.println(total);
		model.addAttribute("paging", new PageVO(cri, total));
		
		// 공지가 1페이지에서만(검색결과는 제외) 보이기 위한 변수 선언
		String keyword = cri.getKeyword();
		model.addAttribute("keyword", keyword);
		System.out.println(cri.getCategory());
		System.out.println(cri.getKeyword());
		return "/review/review";
	}
	
	@RequestMapping(value = "/review/reviewwrite", method = RequestMethod.GET)
	public String reviewwrite(Model model, HttpSession session) {	
		String id = (String) session.getAttribute("id");
		model.addAttribute("reviewwrite", rs.reviewwrite(id));
		
		return "/review/reviewwrite";
	}
	
	// 글쓰기에서 카테고리, 제목, 내용을 DB로 보내기 위한 back작업을 위한...
			@RequestMapping(value = "/review/reviewwrite", method = RequestMethod.POST, consumes="application/json; charset=utf-8")
			public ResponseEntity<String> reviewwritePost(HttpServletRequest request,@RequestBody ReviewVO rev) {
				HttpSession session = request.getSession();
				String id = (String) session.getAttribute("id");
				rev.setId(id);
				System.out.println("rev");
				rs.reviewwrite1(rev);
				return new ResponseEntity<> ("success", HttpStatus.OK);
			}

}
