package com.sam.db2.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.db2.entity.User;
import com.sam.db2.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired(required = false)
	private UserRepository userRepository;

	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	public User getUserById(int id) {
		return userRepository.findById(id).get();
	}

	// insert the data into the table
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}

	// delete the user data from the table
	public void delete(int id) {
		userRepository.deleteById(id);
	}

	// update the data into the table
	public void update(User user, int userid) {
		userRepository.save(user);
	}
}
