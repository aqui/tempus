package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Warehouse;

@Repository
@Transactional
public interface WarehouseRepository extends BaseRepository<Warehouse>
{

}
