package com.example.Controller;

import java.util.List;
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
import com.example.Entity.Mygoals;
import com.example.Service.MygoalService;


@RestController
@RequestMapping("/api/goal")
public class MygoalController {
	@Autowired
	MygoalService mservice;

	@GetMapping("/getAll")
	public List<Mygoals> getAll(){
		return mservice.getAll();
	}


	@PostMapping("/save")
	public Mygoals saveMygoals(@RequestBody Mygoals mygoal)
	{
		return mservice.saveMygoals(mygoal);
	}

	@DeleteMapping("/deletebyid/{id}")
	public void deleteMygoals(@PathVariable Id id) {
		mservice.deleteMygoals(id);
	}

	@PutMapping("/save/{id}")
	public void updateMygoals(@PathVariable Integer id,@RequestBody Mygoals mygoal) {
		mservice.updateMygoals(id, mygoal);
	}
}




