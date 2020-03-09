package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.OperationType;

@Repository
@Transactional
public interface OperationTypeRepository extends BaseRepository<OperationType>
{

}
