package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.OperationStep;
import in.batur.tempus.repository.OperationStepRepository;
import in.batur.tempus.service.OperationStepService;

@Service
public class OperationStepServiceImpl implements OperationStepService 
{
	Logger logger = LoggerFactory.getLogger(OperationStepServiceImpl.class);

	@Autowired
    private OperationStepRepository operationStepRepository;
	
	@Override
	public List<OperationStep> findAll() 
	{
		return (List<OperationStep>) operationStepRepository.findAll();
	}

	@Override
	public OperationStep findOperationStepById(Long id) 
	{
		Optional<OperationStep> operationStep = operationStepRepository.findById(id);
		if (operationStep.isPresent())
		{
			return operationStep.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public OperationStep saveOperationStep(OperationStep operationStep) 
	{
		return operationStepRepository.save(operationStep);
	}

	@Override
	public void deleteOperationStep(Long id) 
	{
		operationStepRepository.deleteById(id);
	}
}
