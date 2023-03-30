package com.example.Controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Entity.Department;
import com.example.Service.DepService;


@Controller
@RequestMapping("/api/dep")
public class DepController {

	@Autowired
	private DepService dservice;

	@GetMapping("/")
	public String home(Model m) {
		return findPaginated(0, m);
	}
	@GetMapping("/adddep")
	public String adddepForm() {
		return "add_dep";
	}

	@PostMapping("/register")
	public String depRegister(@ModelAttribute Department d, HttpSession session) {
		dservice.addDep(d);
		session.setAttribute("msg", "Department  Added Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id, Model m) {
		Department d = dservice.getDepById(id);
		m.addAttribute("dep", d);
		return "edit";
	}

	@PostMapping("/update")
	public String updatedep(@ModelAttribute Department d, HttpSession session) {
		dservice.addDep(d);
		session.setAttribute("msg", "Dep Data Update Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/delete/{id}")
	public String deleteDep(@PathVariable int id, HttpSession session) {

		dservice.deleteDep(id);
		session.setAttribute("msg", "dep Data Delete Sucessfully..");
		return "redirect:/";
	}

	@GetMapping("/page/{pageno}")
	public String findPaginated(@PathVariable int pageno, Model m) {

		Page<Department> deplist = dservice.getDEpByPaginate(pageno, 2);
		m.addAttribute("dep", deplist);
		m.addAttribute("currentPage", pageno);
		m.addAttribute("totalPages", deplist.getTotalPages());
		m.addAttribute("totalItem", deplist.getTotalElements());
		return "index";
	}

}





