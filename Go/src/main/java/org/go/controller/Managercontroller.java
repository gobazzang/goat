package org.go.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.go.model.BoardVO;
import org.go.model.CriteriaVO;
import org.go.model.MemberVO;
import org.go.model.RepleVO;
import org.go.model.PageVO;
import org.go.model.PurchaseVO;
import org.go.service.Managerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Managercontroller {
	@Autowired
	Managerservice ms;

    // 멤버  목록 리스트 설계
	@RequestMapping(value = "manager/manager", method = RequestMethod.GET)
	// 게시판 목록 리스트
	public String list (Model model, CriteriaVO cri, Model totalmem) {
		// manager.jsp 실행 할 때 select 된 결과를 가져와라
		model.addAttribute("list", ms.list(cri));
		totalmem.addAttribute("total", ms.total(cri));
		// list.jsp 실행 할 때 pageVO에 저장되어 있는 데이터를 가져와라.
		//							 생성자 호출(매개변수가 없는 생성자)
		// board테이블(게시판테이블)에 전체 건수(select해서)를 아래에 190대신에 대입
		int total = ms.total(cri);
		// model.addAttribute("paging", new pageVO(cri, 190));
		model.addAttribute("paging", new PageVO(cri, total));
		return "manager/manager";
		
	}
/*
	// 멤버 리스트에서 아이디 검색
	@RequestMapping(value = "/manager/memsearch", method = RequestMethod.GET)
    public String search(MemberVO member, Model model, Model total) {
		model.addAttribute("search", ms.memsearch(member));
		total.addAttribute("total", ms.totalmem());

		return "manager/manager";
	}
*/
	// 멤버 상세 페이지 설계
	@RequestMapping(value = "/manager/memDetail", method = RequestMethod.GET)
	public String memDetail(MemberVO member, Model model) {
		model.addAttribute("detail", ms.memdetail(member));
		return "/manager/memDetail";
	}

	// 멤버 삭제 설계
	@RequestMapping(value = "/manager/remove", method = RequestMethod.GET)
	public String remove(MemberVO remove) {
		ms.remove(remove);
		// manager/manager.jsp 에서 삭제된 결과를 확인하기 위한 화면이동
		return "redirect:/manager/manager";
	}

	// 작성 글 리스트
	@RequestMapping(value = "/manager/managerWriteList", method = RequestMethod.GET)
	public String managerWriteList(Model model,CriteriaVO cri) {
		model.addAttribute("WList", ms.WriteList(cri));
		int total = ms.boardtotal(cri);
		model.addAttribute("paging", new PageVO(cri, total));
		return "manager/managerWriteList";
	}

	// 글 삭제
	@RequestMapping(value = "/manager/writeremove", method = RequestMethod.GET)
	public String bremove(BoardVO bremove,HttpServletRequest request) {
		ms.bremove(bremove);
		// manager/manager.jsp 에서 삭제된 결과를 확인하기 위한 화면이동
		
		 String referer = request.getHeader("Referer");		
		 return "redirect:" + referer;
	}

	// 댓글 리스트
	@RequestMapping(value = "/manager/managerRepleList", method = RequestMethod.GET)
	public String managerRepleList(Model model, CriteriaVO cri) {
		model.addAttribute("RList", ms.RepleList(cri));
		
		int total = ms.repletotal(cri);
		model.addAttribute("paging", new PageVO(cri, total));
		return "manager/managerRepleList";	
		}
	
	// 댓글 삭제
	@RequestMapping(value = "/manager/repleremove", method = RequestMethod.GET)
	public String repleremove(RepleVO remove,HttpServletRequest request) {
		ms.repleremove(remove);
		// manager/manager.jsp 에서 삭제된 결과를 확인하기 위한 화면이동
		String referer = request.getHeader("Referer");		
		return "redirect:" + referer;
	}

	/*
	 * 글 수정 설계
	 * 
	 * @RequestMapping(value = "/manager/modify", method = RequestMethod.POST)
	 * public void modify(BoardVO boadrd) { bs.modify(board) boarddetail.jsp에서 수정된
	 * 결과를 확인하기 위한 화면이동
	 * 
	 * }
	 */

	@RequestMapping(value = "manager/orderlist1", method = RequestMethod.GET)
	public String orderlist1(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		model.addAttribute("orderlist1", ms.orderlist1(id));

		return "manager/orderlist1";
	}
	
	@RequestMapping(value = "manager/orderlist1", method = RequestMethod.POST)
	public String orderlist2(PurchaseVO pu ,HttpServletRequest request) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		pu.setId(id);
		System.out.println(pu);
		return "manager/orderlist1";
	}
	
	

}
