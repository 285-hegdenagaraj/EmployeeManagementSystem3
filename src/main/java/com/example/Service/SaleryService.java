package com.example.Service;

import java.util.List;
import java.util.Optional;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entity.Salery;
import com.example.Repository.Saleryrepo;

@Service
public class SaleryService {
	@Autowired
	Saleryrepo srepo;

	public List<Salery> getAll(){
		List<Salery> list=(List<Salery>)
				srepo.findAll();
		return list;
	}
	public Optional<Salery> getbyId(Integer id){
		Optional<Salery> sal=srepo.findById(id);
		return sal;
	}
	public Salery saveSalery(Salery salery)
	{
		return srepo.save(salery);
	}
	public void updateSalery (Integer id, Salery salery) {
		if(salery.getId()==id) {
			srepo.save(saveSalery(salery));
		}
	}
	public void deleteSalery(Id id) {
		srepo.deleteById(id);
	}


}
