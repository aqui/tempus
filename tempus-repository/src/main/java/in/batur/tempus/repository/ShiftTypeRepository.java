package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ShiftType;

@Repository
@Transactional
public interface ShiftTypeRepository extends BaseRepository<ShiftType>
{

}
