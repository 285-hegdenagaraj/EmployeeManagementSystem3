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
import com.example.Entity.ApplyLeave;
import com.example.Service.LeaveService;



@Controller
@RequestMapping("/api/leave")
public class LeaveController {

	@Autowired
	private LeaveService lservice;

	@GetMapping("/addleave")
	public String addleaveForm() {
		return "add_leaves";
	}

	@PostMapping("/register")
	public String leaveRegister(@ModelAttribute ApplyLeave a, HttpSession session) {
		lservice.addLeave(a);
		session.setAttribute("msg", "Leave  Added Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		ApplyLeave c = lservice.getLeaveById(id);
		m.addAttribute("leave", c);
		return "edit";
	}

	@PostMapping("/update")
	public String updateleave(@ModelAttribute ApplyLeave c, HttpSession session) {
		lservice.addLeave(c);
		session.setAttribute("msg", "Leave Data Updated Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteleave(@PathVariable int id, HttpSession session) {
		lservice.deleteLeave(id);
		session.setAttribute("msg", "Leave Data Deleted Sucessfully..");
		return "redirect:/";
	}

}



