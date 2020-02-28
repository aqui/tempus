package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.CodeTable;

@Repository
public interface CodeTableRepository extends PagingAndSortingRepository<CodeTable, Long>
{

}
