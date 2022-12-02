package org.go.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.go.model.PurchaseVO;
import org.go.service.Orderlistservice;
import org.go.service.Purchaseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Orderlistcontroller {

	@Autowired
	Orderlistservice os;
	
	@Autowired
	Purchaseservice ps;
	
	@RequestMapping(value = "purchase/orderlist", method = RequestMethod.GET)
	public String orderlist(Model model, HttpSession session,PurchaseVO pu) {
		String id = (String) session.getAttribute("id");
		pu.setId(id);
		System.out.println(id);
		model.addAttribute("orderlist", os.orderlist(id));

		return "purchase/orderlist";
	}
	
	@RequestMapping(value = "purchase/orderlist", method = RequestMethod.POST)
	public String orderlist1(PurchaseVO pu ,HttpServletRequest request) {
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		pu.setId(id);
		ps.Purchase1(pu);
		System.out.println(pu.getPname());
		System.out.println(pu.getUniprice());

		return "redirect:/purchase/orderlist";
	}
}
