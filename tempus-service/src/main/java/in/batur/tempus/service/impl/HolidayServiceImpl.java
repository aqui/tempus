package in.batur.tempus.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.batur.tempus.entity.Holiday;
import in.batur.tempus.repository.HolidayRepository;
import in.batur.tempus.service.HolidayService;

@Service
public class HolidayServiceImpl implements HolidayService 
{
	Logger logger = LoggerFactory.getLogger(HolidayServiceImpl.class);
	
	@Autowired
    private HolidayRepository holidayRepository;
	
	@Override
	public List<Holiday> findAll() 
	{
		return (List<Holiday>) holidayRepository.findAll();
	}

	@Override
	public Holiday findHolidayById(Long id) 
	{
		Optional<Holiday> holiday = holidayRepository.findById(id);
		if (holiday.isPresent())
		{
			return holiday.get();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Holiday saveHoliday(Holiday holiday) 
	{
		return holidayRepository.save(holiday);
	}

	@Override
	public void deleteHoliday(Long id) 
	{
		holidayRepository.deleteById(id);
	}
}
