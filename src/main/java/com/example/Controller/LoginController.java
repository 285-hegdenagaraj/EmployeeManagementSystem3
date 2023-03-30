package com.example.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Entity.Login;
import com.example.Service.LoginService;


@Controller
@RequestMapping("/api/login")
public class LoginController {

	@Autowired
	private LoginService lservice;

	
	@GetMapping("/addlogin")
	public String addloginForm() {
		return "add_login";
	}

	@PostMapping("/register")
	public String loginRegister(@ModelAttribute Login l, HttpSession session) {
		lservice.addlogin(l);
		session.setAttribute("msg", "Logged in successfully. . . . .");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Login l = lservice.getLoginById(id);
		m.addAttribute("login", l);
		return "edit";
	}

	@PostMapping("/update")
	public String updatelogin(@ModelAttribute Login l, HttpSession session) {
		lservice.addlogin(l);
		session.setAttribute("msg", "Login Data Updated Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteDep(@PathVariable int id, HttpSession session) {

		lservice.deleteLogin(id);
		session.setAttribute("msg", "Login Data Deleted Sucessfully..");
		return "redirect:/";
	}

	

}








