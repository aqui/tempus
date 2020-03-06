package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.WorkHour;
import in.batur.tempus.repository.WorkHourRepository;
import in.batur.tempus.service.WorkHourService;

@Service
public class WorkHourServiceImpl implements WorkHourService 
{
	Logger logger = LoggerFactory.getLogger(WorkHourServiceImpl.class);

	@Autowired
    private WorkHourRepository workHourRepository;
	
	@Override
	public List<WorkHour> findAll() 
	{
		return (List<WorkHour>) workHourRepository.findAll();
	}

	@Override
	public WorkHour findWorkHourById(Long id) 
	{
		Optional<WorkHour> workHour = workHourRepository.findById(id);
		if (workHour.isPresent())
		{
			return workHour.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public WorkHour saveWorkHour(WorkHour workHour) 
	{
		return workHourRepository.save(workHour);
	}

	@Override
	public void deleteWorkHour(Long id) 
	{
		workHourRepository.deleteById(id);
	}
}
