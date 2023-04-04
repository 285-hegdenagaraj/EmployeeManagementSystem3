package com.example.Controller;

import java.util.List;
import java.util.Optional;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Entity.Salery;
import com.example.Service.SaleryService;

@RestController

@RequestMapping("api/salary")
public class SaleryController {
	@Autowired
	SaleryService sservice;


	@GetMapping("/getAll")
	public List<Salery> getAll(){
		return sservice.getAll();
	}

	@GetMapping("/getbyid/{id}")
	public Optional<Salery>getById(@PathVariable Integer id){
		return sservice.getbyId(id);
	}
	@PostMapping("/save")
	public Salery saveSalery(@RequestBody Salery salery)
	{
		return sservice.saveSalery(salery);
	}
	@DeleteMapping("/deletebyid/{id}")
	public void deleteSalery(@PathVariable Id id) {
		sservice.deleteSalery(id);
	}
	@PutMapping("/save/{id}")
	public void updateSalery(@PathVariable Integer id,@RequestBody Salery salery) {
		sservice.updateSalery(id, salery);
	}



}
