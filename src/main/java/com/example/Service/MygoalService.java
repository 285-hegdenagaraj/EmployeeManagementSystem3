package com.example.Service;

import java.util.List;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entity.Mygoals;
import com.example.Repository.Goalrepo;

@Service
public class MygoalService {
	@Autowired
	Goalrepo grepo;

	public List<Mygoals> getAll(){
		List<Mygoals> list=(List<Mygoals>)
				grepo.findAll();
		return list;
	}

	public Mygoals saveMygoals(Mygoals goal)
	{
		return grepo.save(goal);
	}
	public void updateMygoals (Integer id, Mygoals goal) {
		if(goal.getId()==id) {
			grepo.save(saveMygoals(goal));
		}
	}
	public void deleteMygoals(Id id) {
		grepo.deleteById(id);
	}


}



