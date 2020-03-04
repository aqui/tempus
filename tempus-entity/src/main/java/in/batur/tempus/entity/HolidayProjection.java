package in.batur.tempus.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "holidayProjection", types = { Holiday.class }) 
public interface HolidayProjection 
{
	String getId();
	String getHolidayDate();
	HolidayType getHolidayType();
}
