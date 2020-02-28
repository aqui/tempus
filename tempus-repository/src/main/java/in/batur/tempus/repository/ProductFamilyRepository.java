package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ProductFamily;

@Repository
public interface ProductFamilyRepository extends PagingAndSortingRepository<ProductFamily, Long>
{

}
