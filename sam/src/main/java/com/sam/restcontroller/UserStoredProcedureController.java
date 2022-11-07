package com.sam.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sam.db2.entity.User;
import com.sam.db2.service.StoredProcedureService;

@RestController
@RequestMapping("/sp2")
public class UserStoredProcedureController {

	@Autowired(required = false)
	private StoredProcedureService storedProcedureService;

	@DeleteMapping("/delete")
	public String deleteValueBy(@RequestParam Integer id) {
		return "" + storedProcedureService.deleteValueBy(id) + "  has been Deleted ";
	}

	@PostMapping("/post")
	public int user_insert_procedure(@RequestBody User user) {
		int id = user.getId();
		String address = user.getAddress();
		String email_id = user.getEmail_id();
		long phone = user.getPhone();
		String username = user.getUser_name();
		return storedProcedureService.user_insert_procedure(id, address, email_id, phone, username);

	}

	@PutMapping("/put")
	public int user_update_procedure(@RequestParam int id, @RequestParam String email) {
		storedProcedureService.user_update_procedure(id, email);
		return id;
	}

}
