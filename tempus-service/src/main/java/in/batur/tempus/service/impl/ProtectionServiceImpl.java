package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Protection;
import in.batur.tempus.repository.ProtectionRepository;
import in.batur.tempus.service.ProtectionService;

@Service
public class ProtectionServiceImpl implements ProtectionService 
{
	Logger logger = LoggerFactory.getLogger(ProtectionServiceImpl.class);

	@Autowired
    private ProtectionRepository protectionRepository;
	
	@Override
	public List<Protection> findAll() 
	{
		return (List<Protection>) protectionRepository.findAll();
	}

	@Override
	public Protection findProtectionById(Long id) 
	{
		Optional<Protection> protection = protectionRepository.findById(id);
		if (protection.isPresent())
		{
			return protection.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Protection saveProtection(Protection protection) 
	{
		return protectionRepository.save(protection);
	}

	@Override
	public void deleteProtection(Long id) 
	{
		protectionRepository.deleteById(id);
	}
}
