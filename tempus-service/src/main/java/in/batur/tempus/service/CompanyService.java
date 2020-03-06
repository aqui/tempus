package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Company;

public interface CompanyService 
{
	public List<Company> findAll();
	public Company findCompanyById(Long id);
	public Company saveCompany(Company company);
	public void deleteCompany(Long id);
}
