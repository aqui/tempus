package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ShiftType;

@Repository
public interface ShiftTypeRepository extends PagingAndSortingRepository<ShiftType, Long>
{

}
