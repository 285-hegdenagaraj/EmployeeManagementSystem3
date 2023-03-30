package com.example.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.Entity.Department;

import com.example.Repository.Deprepo;

@Service
public class DepService {

	@Autowired
	private Deprepo drepo;

	public void addDep(Department d) {
		drepo.save(d);
	}

	public List<Department> getAllDep() {
		return drepo.findAll();
	}

	public Department getDepById(int id) {
		Optional<Department> d = drepo.findById(id);
		if (d.isPresent()) {
			return d.get();
		}
		return null;
	}

	public void deleteDep(int id) {
		drepo.deleteById(id);
	}

	public Page<Department> getDEpByPaginate(int currentPage, int size) {
		Pageable p = PageRequest.of(currentPage, size);
		return drepo.findAll(p);
	}
}




