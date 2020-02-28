package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Holiday;

@Repository
public interface HolidayRepository extends PagingAndSortingRepository<Holiday, Long>
{

}
