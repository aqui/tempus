package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.Holiday;

public interface HolidayService
{
	public List<Holiday> findAll();
	public Holiday findHolidayById(Long id);
	public Holiday saveHoliday(Holiday holiday);
	public void deleteHoliday(Long id);
}
