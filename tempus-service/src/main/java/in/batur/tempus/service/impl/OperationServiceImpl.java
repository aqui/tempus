package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Operation;
import in.batur.tempus.repository.OperationRepository;
import in.batur.tempus.service.OperationService;

@Service
public class OperationServiceImpl implements OperationService 
{
	Logger logger = LoggerFactory.getLogger(OperationServiceImpl.class);

	@Autowired
    private OperationRepository operationRepository;
	
	@Override
	public List<Operation> findAll() 
	{
		return (List<Operation>) operationRepository.findAll();
	}

	@Override
	public Operation findOperationById(Long id) 
	{
		Optional<Operation> operation = operationRepository.findById(id);
		if (operation.isPresent())
		{
			return operation.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Operation saveOperation(Operation operation) 
	{
		return operationRepository.save(operation);
	}

	@Override
	public void deleteOperation(Long id) 
	{
		operationRepository.deleteById(id);
	}
}
