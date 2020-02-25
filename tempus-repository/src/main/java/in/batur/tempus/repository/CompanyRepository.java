package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Company;

@Repository
public interface CompanyRepository extends PagingAndSortingRepository<Company, Long>
{

}
