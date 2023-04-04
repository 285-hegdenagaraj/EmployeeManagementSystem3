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
import com.example.Entity.Cases;
import com.example.Service.CaseService;

@Controller
@RequestMapping("/api/case")
public class CaseController {

	@Autowired
	private CaseService cservice;

	@GetMapping("/addcase")
	public String addcaseForm() {
		return "add_cases";
	}

	@PostMapping("/register")
	public String caseRegister(@ModelAttribute Cases c, HttpSession session) {
		cservice.addCase(c);
		session.setAttribute("msg", "case  Added Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Cases c = cservice.getCaseById(id);
		m.addAttribute("case", c);
		return "edit";
	}

	@PostMapping("/update")
	public String updatecase(@ModelAttribute Cases c, HttpSession session) {
		cservice.addCase(c);
		session.setAttribute("msg", "Case Data Updated Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteCase(@PathVariable int id, HttpSession session) {
		cservice.deleteCase(id);
		session.setAttribute("msg", "Case Data Deleted Sucessfully..");
		return "redirect:/";
	}

}
