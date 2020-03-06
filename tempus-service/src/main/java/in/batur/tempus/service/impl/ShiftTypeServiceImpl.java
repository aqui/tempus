package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.ShiftType;
import in.batur.tempus.repository.ShiftTypeRepository;
import in.batur.tempus.service.ShiftTypeService;

@Service
public class ShiftTypeServiceImpl implements ShiftTypeService 
{
	Logger logger = LoggerFactory.getLogger(ShiftTypeServiceImpl.class);

	@Autowired
    private ShiftTypeRepository shiftTypeRepository;
	
	@Override
	public List<ShiftType> findAll() 
	{
		return (List<ShiftType>) shiftTypeRepository.findAll();
	}

	@Override
	public ShiftType findShiftTypeById(Long id) 
	{
		Optional<ShiftType> shiftType = shiftTypeRepository.findById(id);
		if (shiftType.isPresent())
		{
			return shiftType.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public ShiftType saveShiftType(ShiftType shiftType) 
	{
		return shiftTypeRepository.save(shiftType);
	}

	@Override
	public void deleteShiftType(Long id) 
	{
		shiftTypeRepository.deleteById(id);
	}
}
