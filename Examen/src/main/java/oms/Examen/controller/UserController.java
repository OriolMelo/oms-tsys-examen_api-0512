package oms.Examen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import oms.Examen.dto.User;
import oms.Examen.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired(required = true)
	UserService userService;

	@PostMapping("/add")
	public User saveUser(@RequestBody User user) {
		return userService.add(user);
	}

	@PutMapping("/{id}")
	public User updateUser(@PathVariable(name = "id") int id, @RequestBody User user) {

		User preUser = new User();
		User newUser = new User();

		preUser = userService.getOne(id);

		preUser.setUserName(user.getUserName());
		preUser.setEmail(user.getEmail());
		preUser.setPassword(user.getPassword());

		newUser = userService.update(preUser);

		return newUser;
	}
}
