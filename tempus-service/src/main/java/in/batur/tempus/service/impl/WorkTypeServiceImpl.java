package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.WorkType;
import in.batur.tempus.repository.WorkTypeRepository;
import in.batur.tempus.service.WorkTypeService;

@Service
public class WorkTypeServiceImpl implements WorkTypeService 
{
	Logger logger = LoggerFactory.getLogger(WorkTypeServiceImpl.class);

	@Autowired
    private WorkTypeRepository workTypeRepository;
	
	@Override
	public List<WorkType> findAll() 
	{
		return (List<WorkType>) workTypeRepository.findAll();
	}

	@Override
	public WorkType findWorkTypeById(Long id) 
	{
		Optional<WorkType> workType = workTypeRepository.findById(id);
		if (workType.isPresent())
		{
			return workType.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public WorkType saveWorkType(WorkType workType) 
	{
		return workTypeRepository.save(workType);
	}

	@Override
	public void deleteWorkType(Long id) 
	{
		workTypeRepository.deleteById(id);
	}
}
