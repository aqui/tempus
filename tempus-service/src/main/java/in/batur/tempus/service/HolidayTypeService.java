package in.batur.tempus.service;

import java.util.List;

import in.batur.tempus.entity.HolidayType;

public interface HolidayTypeService
{
	public List<HolidayType> findAll();
	public HolidayType findHolidayTypeById(Long id);
	public HolidayType saveHolidayType(HolidayType holidayType);
	public void deleteHolidayType(Long id);
}
