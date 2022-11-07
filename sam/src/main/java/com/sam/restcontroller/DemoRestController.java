package com.sam.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sam.db2.entity.User;
import com.sam.db2.service.UserService;

@RestController
/*
===============================================================================
@RestController annotation is a special controller used in RESTful Web services,
 	and it’s the combination of @Controller and @ResponseBody annotation.
 	
It is a specialized version of @Controller annotation.

In @RestController, we can not return a view.

@RestController annotation indicates that class is a controller
 	where @RequestMapping methods assume @ResponseBody semantics by default.
 	
In @RestController, we don’t need to use @ResponseBody on every handler method.

It was added to Spring 4.0 version.
================================================================================
*/
@RequestMapping("/demo")
public class DemoRestController {


	@Autowired(required = false)
	UserService userService;

	@GetMapping("/user/get")
	private List<User> getAllUser() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{userid}")
	public User getUsers(@PathVariable("userid") int userid) {
		return userService.getUserById(userid);
	}

	@DeleteMapping("/user/{userid}")
	public void deleteUser(@PathVariable("userid") int userid) {
		userService.delete(userid);
	}

	@PostMapping("/user/post")
	public int saveUser(@RequestBody User user) {
		userService.saveOrUpdate(user);
		return user.getId();
	}

	@PutMapping("/user/put")
	public User update(@RequestBody User user) {
		userService.saveOrUpdate(user);
		return user;
	}

}