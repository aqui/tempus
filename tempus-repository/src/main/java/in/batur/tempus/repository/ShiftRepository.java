package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Shift;

@Repository
@Transactional
public interface ShiftRepository extends BaseRepository<Shift>
{

}
