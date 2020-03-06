package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.HolidayType;
import in.batur.tempus.repository.HolidayTypeRepository;
import in.batur.tempus.service.HolidayTypeService;

@Service
public class HolidayTypeServiceImpl implements HolidayTypeService 
{
	Logger logger = LoggerFactory.getLogger(HolidayTypeServiceImpl.class);

	@Autowired
    private HolidayTypeRepository holidayTypeRepository;
	
	@Override
	public List<HolidayType> findAll() 
	{
		return (List<HolidayType>) holidayTypeRepository.findAll();
	}

	@Override
	public HolidayType findHolidayTypeById(Long id) 
	{
		Optional<HolidayType> holidayType = holidayTypeRepository.findById(id);
		if (holidayType.isPresent())
		{
			return holidayType.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public HolidayType saveHolidayType(HolidayType holidayType) 
	{
		return holidayTypeRepository.save(holidayType);
	}

	@Override
	public void deleteHolidayType(Long id) 
	{
		holidayTypeRepository.deleteById(id);
	}
}
