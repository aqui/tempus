package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.OperationType;

@Repository
public interface OperationTypeRepository extends PagingAndSortingRepository<OperationType, Long>
{

}
