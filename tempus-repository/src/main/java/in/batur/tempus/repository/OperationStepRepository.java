package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.OperationStep;

@Repository
public interface OperationStepRepository extends PagingAndSortingRepository<OperationStep, Long>
{

}