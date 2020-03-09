package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Operation;

@Repository
@Transactional
public interface OperationRepository extends BaseRepository<Operation>
{

}
