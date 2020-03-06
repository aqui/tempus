package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.WorkHourTemplate;
import in.batur.tempus.repository.WorkHourTemplateRepository;
import in.batur.tempus.service.WorkHourTemplateService;

@Service
public class WorkHourTemplateServiceImpl implements WorkHourTemplateService 
{
	Logger logger = LoggerFactory.getLogger(WorkHourTemplateServiceImpl.class);

	@Autowired
    private WorkHourTemplateRepository workHourTemplateRepository;
	
	@Override
	public List<WorkHourTemplate> findAll() 
	{
		return (List<WorkHourTemplate>) workHourTemplateRepository.findAll();
	}

	@Override
	public WorkHourTemplate findWorkHourTemplateById(Long id) 
	{
		Optional<WorkHourTemplate> workHourTemplate = workHourTemplateRepository.findById(id);
		if (workHourTemplate.isPresent())
		{
			return workHourTemplate.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public WorkHourTemplate saveWorkHourTemplate(WorkHourTemplate workHourTemplate) 
	{
		return workHourTemplateRepository.save(workHourTemplate);
	}

	@Override
	public void deleteWorkHourTemplate(Long id) 
	{
		workHourTemplateRepository.deleteById(id);
	}
}
