package in.batur.tempus.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.repository.CompanyRepository;
import in.batur.tempus.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService
{
	Logger logger = LoggerFactory.getLogger(CompanyServiceImpl.class);
	
	@Autowired
	private CompanyRepository companyRepository;
}
