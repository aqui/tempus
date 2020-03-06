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

import in.batur.tempus.entity.Authority;
import in.batur.tempus.service.AuthorityService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/authority")
public class AuthorityController 
{
Logger logger = LoggerFactory.getLogger(AuthorityController.class);
	
	@Autowired
	private AuthorityService authorityService;
	
	@GetMapping
	public List<Authority> findAll()
	{
		return authorityService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Authority getAuthorityById(@PathVariable Long id) 
	{
		Authority authority = authorityService.findAuthorityById(id);
		if (authority == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return authority;
	}
	
	@PostMapping
	public Authority saveAuthority(@Valid @RequestBody Authority authority) 
	{
		return authorityService.saveAuthority(authority);
	}
	
	@PutMapping
	public void updateAuthority(@Valid @RequestBody Authority authority) 
	{
		authorityService.saveAuthority(authority);
	}

	@DeleteMapping("/{id}")
	public void deleteAuthority(@PathVariable Long id) 
	{
		authorityService.deleteAuthority(id);
	}
}
