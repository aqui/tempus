package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Line;
import in.batur.tempus.repository.LineRepository;
import in.batur.tempus.service.LineService;

@Service
public class LineServiceImpl implements LineService 
{
	Logger logger = LoggerFactory.getLogger(LineServiceImpl.class);

	@Autowired
    private LineRepository lineRepository;
	
	@Override
	public List<Line> findAll() 
	{
		return (List<Line>) lineRepository.findAll();
	}

	@Override
	public Line findLineById(Long id) 
	{
		Optional<Line> line = lineRepository.findById(id);
		if (line.isPresent())
		{
			return line.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Line saveLine(Line line) 
	{
		return lineRepository.save(line);
	}

	@Override
	public void deleteLine(Long id) 
	{
		lineRepository.deleteById(id);
	}
}
