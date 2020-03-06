package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Part;
import in.batur.tempus.repository.PartRepository;
import in.batur.tempus.service.PartService;

@Service
public class PartServiceImpl implements PartService 
{
	Logger logger = LoggerFactory.getLogger(PartServiceImpl.class);

	@Autowired
    private PartRepository partRepository;
	
	@Override
	public List<Part> findAll() 
	{
		return (List<Part>) partRepository.findAll();
	}

	@Override
	public Part findPartById(Long id) 
	{
		Optional<Part> part = partRepository.findById(id);
		if (part.isPresent())
		{
			return part.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Part savePart(Part part) 
	{
		return partRepository.save(part);
	}

	@Override
	public void deletePart(Long id) 
	{
		partRepository.deleteById(id);
	}
}
