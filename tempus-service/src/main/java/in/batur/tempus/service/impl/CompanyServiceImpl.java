package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Company;
import in.batur.tempus.repository.CompanyRepository;
import in.batur.tempus.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService
{
	Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);

	@Autowired
    private CompanyRepository companyRepository;
	
	@Override
	public List<Company> findAll() 
	{
		return (List<Company>) companyRepository.findAll();
	}

	@Override
	public Company findCompanyById(Long id) 
	{
		Optional<Company> company = companyRepository.findById(id);
		if (company.isPresent())
		{
			return company.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Company saveCompany(Company company) 
	{
		return companyRepository.save(company);
	}

	@Override
	public void deleteCompany(Long id) 
	{
		companyRepository.deleteById(id);
	}
}
