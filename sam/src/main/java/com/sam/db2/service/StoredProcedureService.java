package com.sam.db2.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.db2.repository.UserRepository;

@Service
public class StoredProcedureService {

	@Autowired(required = false)
	private UserRepository userRepository;

	public int  deleteValueBy(int id) {
		return userRepository.deleteValueBy(id);
	}

	public int  user_insert_procedure(int id, String address, String email_id, long phone, String username) {
		return userRepository.user_insert_procedure(id, address, email_id, phone, username);
	}
	
	public void user_update_procedure(int id, String eamil) {
		userRepository.user_update_procedure(id, eamil);
	}

}
