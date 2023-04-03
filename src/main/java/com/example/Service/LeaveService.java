package com.example.Service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Entity.ApplyLeave;
import com.example.Repository.Leaverepo;

@Service
public class LeaveService {

	@Autowired
	private Leaverepo lrepo;

	public void addLeave(ApplyLeave l) {
		lrepo.save(l);
	}

	public List<ApplyLeave> getAllLeave() {
		return lrepo.findAll();
	}

	public ApplyLeave getLeaveById(int id) {
		Optional<ApplyLeave> a = lrepo.findById(id);
		if (a.isPresent()) {
			return a.get();
		}
		return null;
	}

	public void deleteLeave(int id) {
		lrepo.deleteById(id);
	}



}



