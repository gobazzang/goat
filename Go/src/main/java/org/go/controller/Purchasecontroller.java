package org.go.controller;



import javax.servlet.http.HttpSession;

import org.go.model.MemberVO;
import org.go.model.PurchaseVO;
import org.go.service.Purchaseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Purchasecontroller {
    
	@Autowired
	Purchaseservice ps;
	
	@RequestMapping(value = "Purchase/Purchase", method = RequestMethod.GET)
	public String Purchase(Model model, HttpSession session,String[] pno, MemberVO member) {
		String id = (String) session.getAttribute("id");
		member.setId(id);
		System.out.println(id);
		System.out.println(pno[0]);
		model.addAttribute("Purchase", ps.Purchase(id,pno));
		model.addAttribute("member",ps.detail(member));
		return "purchase/purchase";
	}
	
	@RequestMapping(value = "Purchase/Purchase", method = RequestMethod.POST)
	public void Purchase1(PurchaseVO pu) {
		System.out.println(pu.getPname());
		
		System.out.println("ㅎㅇ");
	}

	
	@RequestMapping(value = "list/Purchase2", method = RequestMethod.GET)
	public void Purchase2() {	
	}
	
	@RequestMapping(value = "list/Purchase2", method = RequestMethod.POST)
	public void Purchase3() {	
	}
}
