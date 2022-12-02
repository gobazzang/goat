package org.go.controller;

import org.go.service.Listservice;
import org.go.service.Boardservice;
import org.go.model.BoardVO;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.go.model.CriteriaVO;
import org.go.model.PageVO;
import org.go.model.ProductVO;
import org.go.model.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Listcontroller {
	
	@Autowired
	Listservice ls;
	
	@Autowired
	Boardservice bs;
	
	
	@RequestMapping(value = "/list/outwear", method = RequestMethod.GET)
	public void outwear() {
	}

	@RequestMapping(value = "/list/outwearlist", method = RequestMethod.GET)
	public void outwearlist() {	
	}
	
	@RequestMapping(value = "/list/outwearlist1", method = RequestMethod.GET)
	public void outwearlist1() {	
	}
	
	@RequestMapping(value = "/list/outwearlist2", method = RequestMethod.GET)
	public void outwearlist2() {	
	}
	
	@RequestMapping(value = "/list/outwearlist3", method = RequestMethod.GET)
	public void outwearlist3() {	
	}
	
	@RequestMapping(value = "/list/outwearlist4", method = RequestMethod.GET)
	public void outwearlist4() {	
	}
	
	@RequestMapping(value = "/list/outwearlist5", method = RequestMethod.GET)
	public void outwearlist5() {	
	}
	
	@RequestMapping(value = "/list/outwearlist6", method = RequestMethod.GET)
	public void outwearlist6() {	
	}
	
	@RequestMapping(value = "/list/outwearlist7", method = RequestMethod.GET)
	public void outwearlist7() {	
	}
	
	@RequestMapping(value = "/list/outwearlist8", method = RequestMethod.GET)
	public void outwearlist8() {	
	}
	
	@RequestMapping(value = "/list/outwearlist", method = RequestMethod.POST)
	public String outwearlistbasket(ProductVO pro,HttpServletRequest request){ 
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		pro.setId(id);
		ls.outwearlist(pro);
		System.out.println(pro);
		return "redirect:/pay/basket";
	}
	
	@RequestMapping(value = "/list/outwearlist1", method = RequestMethod.POST)
	public String outwearlistreview(ReviewVO rv,HttpServletRequest request){ 
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		rv.setId(id);
		ls.outwearlist1(rv);
		System.out.println(rv);
		return "redirect:/review/reviewwrite";
	}
	
	@RequestMapping(value = "/list/top", method = RequestMethod.GET)
	public void top() {
	}
	
	@RequestMapping(value = "/list/toplist", method = RequestMethod.GET)
	public void toplist() {
	}
	
	@RequestMapping(value = "/list/toplist1", method = RequestMethod.GET)
	public void toplist1() {
	}
	
	@RequestMapping(value = "/list/toplist2", method = RequestMethod.GET)
	public void toplist2() {
	}
	
	@RequestMapping(value = "/list/toplist3", method = RequestMethod.GET)
	public void toplist3() {
	}
	
	@RequestMapping(value = "/list/toplist4", method = RequestMethod.GET)
	public void toplist4() {
	}
	
	@RequestMapping(value = "/list/toplist5", method = RequestMethod.GET)
	public void toplist5() {
	}
	
	@RequestMapping(value = "/list/toplist6", method = RequestMethod.GET)
	public void toplist6() {
	}
	
	@RequestMapping(value = "/list/toplist7", method = RequestMethod.GET)
	public void toplist7() {
	}
	
	@RequestMapping(value = "/list/toplist8", method = RequestMethod.GET)
	public void toplist8() {
	}
	
	
	
	@RequestMapping(value = "/list/bottom", method = RequestMethod.GET)
	public void bottom() {
	}
	
	@RequestMapping(value = "/list/bottomlist", method = RequestMethod.GET)
	public void bottomlist() {
	}
	
	@RequestMapping(value = "/list/bottomlist1", method = RequestMethod.GET)
	public void bottomlist1() {
	}
	
	@RequestMapping(value = "/list/bottomlist2", method = RequestMethod.GET)
	public void bottomlist2() {
	}
	
	@RequestMapping(value = "/list/bottomlist3", method = RequestMethod.GET)
	public void bottomlist3() {
	}
	
	@RequestMapping(value = "/list/bottomlist4", method = RequestMethod.GET)
	public void bottomlist4() {
	}
	
	@RequestMapping(value = "/list/bottomlist5", method = RequestMethod.GET)
	public void bottomlist5() {
	}
	
	@RequestMapping(value = "/list/bottomlist6", method = RequestMethod.GET)
	public void bottomlist6() {
	}
	
	@RequestMapping(value = "/list/bottomlist7", method = RequestMethod.GET)
	public void bottomlist7() {
	}
	
	@RequestMapping(value = "/list/bottomlist8", method = RequestMethod.GET)
	public void bottomlist8() {
	}
	
	@RequestMapping(value = "/list/headwear", method = RequestMethod.GET)
	public void headwear() {
	}
	
	@RequestMapping(value = "/list/headwearlist", method = RequestMethod.GET)
	public void headwearlist() {
	}
	
	@RequestMapping(value = "/list/headwearlist1", method = RequestMethod.GET)
	public void headwearlist1() {
	}
	
	@RequestMapping(value = "/list/headwearlist2", method = RequestMethod.GET)
	public void headwearlist2() {
	}
	
	@RequestMapping(value = "/list/headwearlist3", method = RequestMethod.GET)
	public void headwearlist3() {
	}
	
	
	@RequestMapping(value = "/list/bag", method = RequestMethod.GET)
	public void bag() {
	}
	
	@RequestMapping(value = "/list/baglist", method = RequestMethod.GET)
	public void baglist() {
	}
	
	@RequestMapping(value = "/list/shoes", method = RequestMethod.GET)
	public void shoes() {
	}
	
	@RequestMapping(value = "/list/shoeslist", method = RequestMethod.GET)
	public void shoeslist() {
	}
	
	@RequestMapping(value = "/list/shoeslist1", method = RequestMethod.GET)
	public void shoeslist1() {
	}
	
	@RequestMapping(value = "/list/shoeslist2", method = RequestMethod.GET)
	public void shoeslist2() {
	}
	
	@RequestMapping(value = "/list/shoeslist3", method = RequestMethod.GET)
	public void shoeslist3() {
	}
	
	@RequestMapping(value = "/list/eyewear", method = RequestMethod.GET)
	public void eyewear() {
	}
	
	@RequestMapping(value = "/list/eyewearlist", method = RequestMethod.GET)
	public void eyewearlist() {
	}
	
	@RequestMapping(value = "/list/eyewearlist1", method = RequestMethod.GET)
	public void eyewearlist1() {
	}
	
	@RequestMapping(value = "/list/eyewearlist2", method = RequestMethod.GET)
	public void eyewearlist2() {
	}
	
	@RequestMapping(value = "/list/acc", method = RequestMethod.GET)
	public void acc() {
	}
	
	@RequestMapping(value = "/list/acclist", method = RequestMethod.GET)
	public void acclist() {
	}
	
	@RequestMapping(value = "/list/acclist1", method = RequestMethod.GET)
	public void acclist1() {
	}
	
	@RequestMapping(value = "/list/acclist2", method = RequestMethod.GET)
	public void acclist2() {
	}
	
	
	
	@RequestMapping(value = "/list/list", method = RequestMethod.GET)
	public String list(Model model, CriteriaVO cri) {
		System.out.println(cri);
		// list.jsp 실행 할 때 매니저글 select 된 결과를 가져가라.
		model.addAttribute("manager",ls.manager());
		// list.jsp 실행 할 때 select 된 결과를 가져가라.
		model.addAttribute("list", ls.list(cri));
		// list 폴더 안에 있는 list.jsp 실행 할 때 pageVO에 저장되어 있는 데이터를 가져와라.
		//							생성자 호출(매개변수가 없는 생성자)
		// int total = ls.total();
		int total = ls.total(cri);
		System.out.println(total);
		model.addAttribute("paging", new PageVO(cri, total));
		
		// 공지가 1페이지에서만(검색결과는 제외) 보이기 위한 변수 선언
		String keyword = cri.getKeyword();
		model.addAttribute("keyword", keyword);
		System.out.println(cri.getCategory());
		System.out.println(cri.getKeyword());
		return "list/list";
		
	}
	
	// main폴더 안에 있는 write.jsp를 실행할 때
		@RequestMapping(value = "/list/write", method = RequestMethod.GET)
		public void write(HttpServletRequest request, Model model) {
			HttpSession session = request.getSession();
			String id = (String) session.getAttribute("id");
			System.out.println(id);
		}
		
		// 글쓰기에서 카테고리, 제목, 내용을 DB로 보내기 위한 back작업을 위한...
		@RequestMapping(value = "/list/write", method = RequestMethod.POST, consumes="application/json; charset=utf-8")
		public ResponseEntity<String> writePost(HttpServletRequest request,@RequestBody BoardVO board) {
			HttpSession session = request.getSession();
			String id = (String) session.getAttribute("id");
			String nick = (String) session.getAttribute("nick");
			board.setId(id);
			board.setNick(nick);
			System.out.println("board");
			bs.boardwrite(board);
			return new ResponseEntity<> ("success", HttpStatus.OK);
		}
		
		@RequestMapping(value = "/list/list_icon2", method = RequestMethod.GET)
		public String list_icon2(Model model, CriteriaVO cri) {
			System.out.println(cri);
			// list.jsp 실행 할 때 매니저글 select 된 결과를 가져가라.
			model.addAttribute("manager",ls.manager());
			// list.jsp 실행 할 때 select 된 결과를 가져가라.
			model.addAttribute("list", ls.imglist(cri));
			System.out.println(ls.imglist(cri));
			// list 폴더 안에 있는 list.jsp 실행 할 때 pageVO에 저장되어 있는 데이터를 가져와라.
			//							생성자 호출(매개변수가 없는 생성자)
			// int total = ls.total();
			int total = ls.imgtotal(cri);
			System.out.println(total);
			model.addAttribute("paging", new PageVO(cri, total));
			
			// 공지가 1페이지에서만(검색결과는 제외) 보이기 위한 변수 선언
			String keyword = cri.getKeyword();
			model.addAttribute("keyword", keyword);
			System.out.println(cri.getCategory());
			System.out.println(cri.getKeyword());
			return "list/list_icon2";
			
		}

		@RequestMapping(value = "/list/list_icon3", method = RequestMethod.GET)
		public String list_icon3(Model model, CriteriaVO cri) {
			System.out.println(cri);
			// list.jsp 실행 할 때 매니저글 select 된 결과를 가져가라.
			model.addAttribute("manager",ls.manager());
			// list.jsp 실행 할 때 select 된 결과를 가져가라.
			model.addAttribute("list", ls.imglist(cri));
			System.out.println(ls.imglist(cri));
			// list 폴더 안에 있는 list.jsp 실행 할 때 pageVO에 저장되어 있는 데이터를 가져와라.
			//							생성자 호출(매개변수가 없는 생성자)
			// int total = ls.total();
			int total = ls.imgtotal(cri);
			System.out.println(total);
			model.addAttribute("paging", new PageVO(cri, total));
			
			// 공지가 1페이지에서만(검색결과는 제외) 보이기 위한 변수 선언
			String keyword = cri.getKeyword();
			model.addAttribute("keyword", keyword);
			System.out.println(cri.getCategory());
			System.out.println(cri.getKeyword());
			return "list/list_icon3";
			
		}
	
	
	
}
