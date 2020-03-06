package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.AnalysisType;
import in.batur.tempus.repository.AnalysisTypeRepository;
import in.batur.tempus.service.AnalysisTypeService;

@Service
public class AnalysisTypeServiceImpl implements AnalysisTypeService 
{
	Logger logger = LoggerFactory.getLogger(AnalysisTypeServiceImpl.class);
	
	@Autowired
    private AnalysisTypeRepository analysisTypeRepository;
	
	@Override
	public List<AnalysisType> findAll() 
	{
		return (List<AnalysisType>) analysisTypeRepository.findAll();
	}

	@Override
	public AnalysisType findAnalysisTypeById(Long id) 
	{
		Optional<AnalysisType> analysisType = analysisTypeRepository.findById(id);
		if (analysisType.isPresent())
		{
			return analysisType.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public AnalysisType saveAnalysisType(AnalysisType analysisType) 
	{
		return analysisTypeRepository.save(analysisType);
	}

	@Override
	public void deleteAnalysisType(Long id) 
	{
		analysisTypeRepository.deleteById(id);
	}
}
