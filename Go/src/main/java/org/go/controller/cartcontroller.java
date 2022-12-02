package org.go.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.go.model.ProductVO;
import org.go.service.Cartservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class cartcontroller {

	@Autowired
	Cartservice cs;

	@RequestMapping(value = "pay/basket", method = RequestMethod.GET)
	public String basket(Model model, HttpSession session) {
		String id = (String) session.getAttribute("id");
		model.addAttribute("basket", cs.basket(id));

		return "pay/basket";
	}
	
	@RequestMapping(value = "pay/basket", method = RequestMethod.POST)
	public String basketlist(ProductVO pro,HttpServletRequest request){ 
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		pro.setId(id);
		System.out.println(pro);
		return "redirect:/Purchase";
	}

	@RequestMapping(value = "/basket", method = RequestMethod.POST)
	public ResponseEntity<String> modify(ProductVO pro, RedirectAttributes rttr, HttpSession session) {

		System.out.println("\"contoroleer===>\"+pro");
		rttr.addAttribute("id", pro.getId());
		int result = cs.modify(pro);
		System.out.println(result);
		return result == 1 ? new ResponseEntity<>("success", HttpStatus.OK)
				   : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value = "/remove", method = RequestMethod.POST)
	public ResponseEntity<String> remove(ProductVO pro) {
		System.out.println("bay=" + pro);
		int result = cs.remove(pro);
		System.out.println(result);
		return result == 1 ? new ResponseEntity<>("success", HttpStatus.OK)
				   : new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

	}

}
