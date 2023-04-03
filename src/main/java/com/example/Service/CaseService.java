package com.example.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entity.Cases;
import com.example.Repository.Caserepo;

@Service
public class CaseService {

	@Autowired
	private Caserepo crepo;

	public void addCase(Cases c) {
		crepo.save(c);
	}

	public List<Cases> getAllCase() {
		return crepo.findAll();
	}

	public Cases getCaseById(int id) {
		Optional<Cases> d = crepo.findById(id);
		if (d.isPresent()) {
			return d.get();
		}
		return null;
	}

	public void deleteCase(int id) {
		crepo.deleteById(id);
	}



}
