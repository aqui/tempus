package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Station;

@Repository
public interface StationRepository extends PagingAndSortingRepository<Station, Long>
{

}
