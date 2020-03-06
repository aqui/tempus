package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.OperationType;
import in.batur.tempus.repository.OperationTypeRepository;
import in.batur.tempus.service.OperationTypeService;

@Service
public class OperationTypeServiceImpl implements OperationTypeService 
{
	Logger logger = LoggerFactory.getLogger(OperationTypeServiceImpl.class);

	@Autowired
    private OperationTypeRepository operationTypeRepository;
	
	@Override
	public List<OperationType> findAll() 
	{
		return (List<OperationType>) operationTypeRepository.findAll();
	}

	@Override
	public OperationType findOperationTypeById(Long id) 
	{
		Optional<OperationType> operationType = operationTypeRepository.findById(id);
		if (operationType.isPresent())
		{
			return operationType.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public OperationType saveOperationType(OperationType operationType) 
	{
		return operationTypeRepository.save(operationType);
	}

	@Override
	public void deleteOperationType(Long id) 
	{
		operationTypeRepository.deleteById(id);
	}
}
