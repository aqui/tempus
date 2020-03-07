package in.batur.tempus.web.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.batur.tempus.entity.User;
import in.batur.tempus.service.UserService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/user")
public class UserController 
{
Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<User> findAll()
	{
		return userService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public User getUserById(@PathVariable Long id) 
	{
		User user = userService.findUserById(id);
		if (user == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return user;
	}
	
	@PostMapping("/")
	public User saveUser(@Valid @RequestBody User user) 
	{
		return userService.saveUser(user);
	}
	
	@PutMapping("/")
	public User updateUser(@Valid @RequestBody User user) 
	{
		return userService.saveUser(user);
	}

	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable Long id) 
	{
		userService.deleteUser(id);
	}
}
