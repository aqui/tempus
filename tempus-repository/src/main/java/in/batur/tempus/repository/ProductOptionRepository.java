package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ProductOption;

@Repository
public interface ProductOptionRepository extends PagingAndSortingRepository<ProductOption, Long>
{

}
