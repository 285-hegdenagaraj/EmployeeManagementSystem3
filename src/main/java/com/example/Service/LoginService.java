package com.example.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Entity.Login;

import com.example.Repository.loginrepo;

@Service
public class LoginService {

	@Autowired
	private loginrepo lrepo;

	public void addlogin(Login l) {
		lrepo.save(l);
	}

	public List<Login> getAllLogin() {
		return lrepo.findAll();
	}

	public Login getLoginById(int id) {
		Optional<Login> d = lrepo.findById(id);
		if (d.isPresent()) {
			return d.get();
		}
		return null;
	}

	public void deleteLogin(int id) {
		// TODO Auto-generated method stub
		
	}

	

}




