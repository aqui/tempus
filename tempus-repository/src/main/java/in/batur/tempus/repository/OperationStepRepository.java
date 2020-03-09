package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.OperationStep;

@Repository
@Transactional
public interface OperationStepRepository extends BaseRepository<OperationStep>
{

}
