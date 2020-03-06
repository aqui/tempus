package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Shift;
import in.batur.tempus.repository.ShiftRepository;
import in.batur.tempus.service.ShiftService;

@Service
public class ShiftServiceImpl implements ShiftService 
{
	Logger logger = LoggerFactory.getLogger(ShiftServiceImpl.class);

	@Autowired
    private ShiftRepository shiftRepository;
	
	@Override
	public List<Shift> findAll() 
	{
		return (List<Shift>) shiftRepository.findAll();
	}

	@Override
	public Shift findShiftById(Long id) 
	{
		Optional<Shift> shift = shiftRepository.findById(id);
		if (shift.isPresent())
		{
			return shift.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Shift saveShift(Shift shift) 
	{
		return shiftRepository.save(shift);
	}

	@Override
	public void deleteShift(Long id) 
	{
		shiftRepository.deleteById(id);
	}
}
