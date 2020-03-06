package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Station;
import in.batur.tempus.repository.StationRepository;
import in.batur.tempus.service.StationService;

@Service
public class StationServiceImpl implements StationService 
{
	Logger logger = LoggerFactory.getLogger(StationServiceImpl.class);

	@Autowired
    private StationRepository stationRepository;
	
	@Override
	public List<Station> findAll() 
	{
		return (List<Station>) stationRepository.findAll();
	}

	@Override
	public Station findStationById(Long id) 
	{
		Optional<Station> station = stationRepository.findById(id);
		if (station.isPresent())
		{
			return station.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Station saveStation(Station station) 
	{
		return stationRepository.save(station);
	}

	@Override
	public void deleteStation(Long id) 
	{
		stationRepository.deleteById(id);
	}
}
