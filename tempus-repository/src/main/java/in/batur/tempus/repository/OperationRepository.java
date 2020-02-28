package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Operation;

@Repository
public interface OperationRepository extends PagingAndSortingRepository<Operation, Long>
{

}
