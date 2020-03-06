package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Code;
import in.batur.tempus.repository.CodeRepository;
import in.batur.tempus.service.CodeService;

@Service
public class CodeServiceImpl implements CodeService 
{
	Logger logger = LoggerFactory.getLogger(CodeServiceImpl.class);

	@Autowired
    private CodeRepository codeRepository;
	
	@Override
	public List<Code> findAll() 
	{
		return (List<Code>) codeRepository.findAll();
	}

	@Override
	public Code findCodeById(Long id) 
	{
		Optional<Code> code = codeRepository.findById(id);
		if (code.isPresent())
		{
			return code.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Code saveCode(Code code) 
	{
		return codeRepository.save(code);
	}

	@Override
	public void deleteCode(Long id) 
	{
		codeRepository.deleteById(id);
	}
}
