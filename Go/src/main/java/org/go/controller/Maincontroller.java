package org.go.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.go.model.MemberVO;
import org.go.service.Memberservice;
import org.go.model.BoardVO;
import org.go.service.Boardservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Maincontroller {

	@Autowired
	Boardservice bs;
	
	@Autowired
	Memberservice ms;

	@RequestMapping(value = "/main/main", method = RequestMethod.GET)
	public void main() {
	}
	
	@RequestMapping(value = "/header/search", method = RequestMethod.GET)
	public void search() {
	}
	
	// main폴더 안에 있는 write.jsp를 실행할 때
		@RequestMapping(value = "/main/write", method = RequestMethod.GET)
		public void write(HttpServletRequest request, Model model) {
			HttpSession session = request.getSession();
			String id = (String) session.getAttribute("id");
			System.out.println(id);
		}
		
		// 글쓰기에서 카테고리, 제목, 내용을 DB로 보내기 위한 back작업을 위한...
		@RequestMapping(value = "/main/write", method = RequestMethod.POST, consumes="application/json; charset=utf-8")
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

	@RequestMapping(value = "/header/login", method = RequestMethod.GET)
	public void login() {
	}

	@RequestMapping(value = "/header/login", method = RequestMethod.POST)
	public String login(MemberVO member, HttpSession session, HttpServletResponse response) throws IOException {
		MemberVO a = ms.login(member);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if (a != null) {
			String id = a.getId();
			String nick = a.getNick();
			System.out.println("session.set(" + id + ")");
			session.setAttribute("id", id);
			session.setAttribute("nick", nick);
		} else {
			out.println("<script>alert('아이디, 비밀번호를 확인해 주세요'); </script>");
			out.flush();
			return "/header/login";
		}
		return "redirect:/main/main";
	}

	@RequestMapping(value = "/header/logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "/header/login";
	}

	@RequestMapping(value = "/header/signup", method = RequestMethod.GET)
	public void signup() {
	}

	@RequestMapping(value = "/header/idcheck", method = RequestMethod.POST)
	public ResponseEntity<Integer> idcheck(MemberVO member, HttpServletResponse response) throws IOException {
		System.out.println(member);
		int result = ms.idcheck(member);
		System.out.println(result);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@RequestMapping(value = "/header/signup", method = RequestMethod.POST)
	public String signuppost(MemberVO member) throws IOException {
		member.setBirth(member.getBirth().replace("-", ""));
		member.setEmail(member.getEmail().replace(",", ""));
		member.setPhone(member.getPhone().replace(",", ""));
		member.setAddr(member.getAddr().replace(",", " "));
		ms.signup(member);
		return "/header/login";
	}
	
	@RequestMapping(value = "/header/idsearch", method = RequestMethod.GET)
	public void idsearchpage() {}
	
	@RequestMapping(value = "/header/idsearch", method = RequestMethod.POST)
	public String idsearch(MemberVO member,HttpServletResponse response) throws IOException {
		String id = ms.idsearch(member);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		if(id!=null) {
			int a = id.length()/2;
			String b = "";
			String serid;
			for(int i=0;i<a;i++) {b+="*";}
			if(id.length()%2==0) {
				serid = id.substring(0,a) + b;
			}else {
				serid = id.substring(0,a) + b + "*";
			}
			out.println("<script>alert('아이디:"+serid+"'); </script>");
			out.flush();
			return "header/login";
		}else {
			out.println("<script>alert('아이디를 찾을 수 없습니다.'); </script>");
			out.flush();
			return "header/idsearch";
		}
	}
	
	// 현재 다음에만 메일이 전송됨 
	@RequestMapping(value = "/header/pwsearch", method = RequestMethod.POST)
	public String pwsearch(MemberVO member,HttpServletResponse response) throws Exception {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		if(ms.findPwCheck(member)==0) {
			out.println("<script>alert('아이디와 이메일을 확인해 주세요'); </script>");
			out.flush();
			return "header/idsearch";
		}else {
			ms.findPw(member);
			out.println("<script>alert('이메일에서 임시 비밀번호를 확인해주세요.네이버,구글은 안됨.'); </script>");
			out.flush();
			return "header/login";
		}

	}
}
