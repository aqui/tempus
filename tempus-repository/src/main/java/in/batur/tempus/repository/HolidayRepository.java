package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Holiday;
import in.batur.tempus.entity.HolidayProjection;

@Repository
@RepositoryRestResource(excerptProjection = HolidayProjection.class)
public interface HolidayRepository extends PagingAndSortingRepository<Holiday, Long>
{

}
