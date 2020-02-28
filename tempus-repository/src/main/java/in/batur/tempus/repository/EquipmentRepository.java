package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Equipment;

@Repository
public interface EquipmentRepository extends PagingAndSortingRepository<Equipment, Long>
{

}
