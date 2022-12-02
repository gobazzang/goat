package org.go.controller;

import org.go.model.AttachFileVO;
import org.go.model.BoardVO;
import org.go.model.ReviewVO;
import org.go.service.ReviewDetailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ReviewDetailcontroller {
	
	 @Autowired
	   ReviewDetailservice rds;
	   
	  @RequestMapping(value = "/review/reviewdetail", method = RequestMethod.GET)
	   public String reviewdetail(ReviewVO rev, Model model) {
	      model.addAttribute("reviewdetail", rds.reviewdetail(rev));
	      return "/review/reviewdetail";
	   }
	   //@RequestMapping(value = "/detail/modify", method = RequestMethod.POST)
	   @RequestMapping(value = "/review/modify", method = RequestMethod.PUT)
	   //public String modify(BoardVO board, RedirectAttributes rttr) {
	   public ResponseEntity <String> modify(@RequestBody ReviewVO rev) {
		   
		   System.out.println("contoroleer===>"+rev); 
		   
		   int result = rds.modify(rev);
	      
		   return result==1? new ResponseEntity<> ("success", HttpStatus.OK)
			               : new ResponseEntity<> (HttpStatus.INTERNAL_SERVER_ERROR);
		   
		   
	   }
	   
	   @RequestMapping(value = "/review/remove", method = RequestMethod.GET)
	   public String remove(ReviewVO rev) {
	      rds.remove(rev);
	      return "redirect:/review/review";
	   }
	   
	 

}
