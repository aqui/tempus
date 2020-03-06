package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Authority;
import in.batur.tempus.repository.AuthorityRepository;
import in.batur.tempus.service.AuthorityService;

@Service
public class AuthorityServiceImpl implements AuthorityService 
{
	Logger logger = LoggerFactory.getLogger(AuthorityServiceImpl.class);

	@Autowired
    private AuthorityRepository authorityRepository;
	
	@Override
	public List<Authority> findAll() 
	{
		return (List<Authority>) authorityRepository.findAll();
	}

	@Override
	public Authority findAuthorityById(Long id) 
	{
		Optional<Authority> authority = authorityRepository.findById(id);
		if (authority.isPresent())
		{
			return authority.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Authority saveAuthority(Authority authority) 
	{
		return authorityRepository.save(authority);
	}

	@Override
	public void deleteAuthority(Long id) 
	{
		authorityRepository.deleteById(id);
	}
}
