package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.NvaaOption;
import in.batur.tempus.repository.NvaaOptionRepository;
import in.batur.tempus.service.NvaaOptionService;

@Service
public class NvaaOptionServiceImpl implements NvaaOptionService 
{
	Logger logger = LoggerFactory.getLogger(NvaaOptionServiceImpl.class);

	@Autowired
    private NvaaOptionRepository nvaaOptionRepository;
	
	@Override
	public List<NvaaOption> findAll() 
	{
		return (List<NvaaOption>) nvaaOptionRepository.findAll();
	}

	@Override
	public NvaaOption findNvaaOptionById(Long id) 
	{
		Optional<NvaaOption> nvaaOption = nvaaOptionRepository.findById(id);
		if (nvaaOption.isPresent())
		{
			return nvaaOption.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public NvaaOption saveNvaaOption(NvaaOption nvaaOption) 
	{
		return nvaaOptionRepository.save(nvaaOption);
	}

	@Override
	public void deleteNvaaOption(Long id) 
	{
		nvaaOptionRepository.deleteById(id);
	}
}
