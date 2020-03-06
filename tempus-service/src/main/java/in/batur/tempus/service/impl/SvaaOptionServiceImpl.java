package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.SvaaOption;
import in.batur.tempus.repository.SvaaOptionRepository;
import in.batur.tempus.service.SvaaOptionService;

@Service
public class SvaaOptionServiceImpl implements SvaaOptionService 
{
	Logger logger = LoggerFactory.getLogger(SvaaOptionServiceImpl.class);

	@Autowired
    private SvaaOptionRepository svaaOptionRepository;
	
	@Override
	public List<SvaaOption> findAll() 
	{
		return (List<SvaaOption>) svaaOptionRepository.findAll();
	}

	@Override
	public SvaaOption findSvaaOptionById(Long id) 
	{
		Optional<SvaaOption> svaaOption = svaaOptionRepository.findById(id);
		if (svaaOption.isPresent())
		{
			return svaaOption.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public SvaaOption saveSvaaOption(SvaaOption svaaOption) 
	{
		return svaaOptionRepository.save(svaaOption);
	}

	@Override
	public void deleteSvaaOption(Long id) 
	{
		svaaOptionRepository.deleteById(id);
	}
}
