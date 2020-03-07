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

import in.batur.tempus.entity.Role;
import in.batur.tempus.service.RoleService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/role")
public class RoleController 
{
Logger logger = LoggerFactory.getLogger(RoleController.class);
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping
	public List<Role> findAll()
	{
		return roleService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Role getRoleById(@PathVariable Long id) 
	{
		Role role = roleService.findRoleById(id);
		if (role == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return role;
	}
	
	@PostMapping("/")
	public Role saveRole(@Valid @RequestBody Role role) 
	{
		return roleService.saveRole(role);
	}
	
	@PutMapping("/")
	public Role updateRole(@Valid @RequestBody Role role) 
	{
		return roleService.saveRole(role);
	}

	@DeleteMapping("/{id}")
	public void deleteRole(@PathVariable Long id) 
	{
		roleService.deleteRole(id);
	}
}
