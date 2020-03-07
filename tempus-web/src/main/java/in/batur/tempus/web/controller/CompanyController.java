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

import in.batur.tempus.entity.Company;
import in.batur.tempus.service.CompanyService;
import in.batur.tempus.web.exception.BaseEntityNotFoundException;

@RestController
@RequestMapping(value = "/api/company")
public class CompanyController 
{
Logger logger = LoggerFactory.getLogger(CompanyController.class);
	
	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public List<Company> findAll()
	{
		return companyService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Company getCompanyById(@PathVariable Long id) 
	{
		Company company = companyService.findCompanyById(id);
		if (company == null)
		{
			throw new BaseEntityNotFoundException("id-" + id);
		}
		return company;
	}
	
	@PostMapping("/")
	public Company saveCompany(@Valid @RequestBody Company company) 
	{
		return companyService.saveCompany(company);
	}
	
	@PutMapping("/")
	public Company updateCompany(@Valid @RequestBody Company company) 
	{
		return companyService.saveCompany(company);
	}

	@DeleteMapping("/{id}")
	public void deleteCompany(@PathVariable Long id) 
	{
		companyService.deleteCompany(id);
	}
}
