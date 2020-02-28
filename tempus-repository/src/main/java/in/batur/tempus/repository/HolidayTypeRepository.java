package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.HolidayType;

@Repository
public interface HolidayTypeRepository extends PagingAndSortingRepository<HolidayType, Long>
{

}
