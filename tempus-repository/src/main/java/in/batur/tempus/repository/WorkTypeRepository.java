package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.WorkType;

@Repository
@Transactional
public interface WorkTypeRepository extends BaseRepository<WorkType>
{

}
