package in.batur.tempus.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long>
{

}
