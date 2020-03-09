package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Product;

@Repository
@Transactional
public interface ProductRepository extends BaseRepository<Product>
{

}
