package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Duty;
import in.batur.tempus.repository.DutyRepository;
import in.batur.tempus.service.DutyService;

@Service
public class DutyServiceImpl implements DutyService 
{
	Logger logger = LoggerFactory.getLogger(DutyServiceImpl.class);

	@Autowired
    private DutyRepository dutyRepository;
	
	@Override
	public List<Duty> findAll() 
	{
		return (List<Duty>) dutyRepository.findAll();
	}

	@Override
	public Duty findDutyById(Long id) 
	{
		Optional<Duty> duty = dutyRepository.findById(id);
		if (duty.isPresent())
		{
			return duty.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Duty saveDuty(Duty duty) 
	{
		return dutyRepository.save(duty);
	}

	@Override
	public void deleteDuty(Long id) 
	{
		dutyRepository.deleteById(id);
	}
}
