package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Warehouse;

@Repository
public interface WarehouseRepository extends PagingAndSortingRepository<Warehouse, Long>
{

}
