package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.CodeTable;
import in.batur.tempus.repository.CodeTableRepository;
import in.batur.tempus.service.CodeTableService;

@Service
public class CodeTableServiceImpl implements CodeTableService 
{
	Logger logger = LoggerFactory.getLogger(CodeTableServiceImpl.class);

	@Autowired
    private CodeTableRepository codeTableRepository;
	
	@Override
	public List<CodeTable> findAll() 
	{
		return (List<CodeTable>) codeTableRepository.findAll();
	}

	@Override
	public CodeTable findCodeTableById(Long id) 
	{
		Optional<CodeTable> codeTable = codeTableRepository.findById(id);
		if (codeTable.isPresent())
		{
			return codeTable.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public CodeTable saveCodeTable(CodeTable codeTable) 
	{
		return codeTableRepository.save(codeTable);
	}

	@Override
	public void deleteCodeTable(Long id) 
	{
		codeTableRepository.deleteById(id);
	}
}
