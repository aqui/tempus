package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ProductType;

@Repository
@Transactional
public interface ProductTypeRepository extends BaseRepository<ProductType>
{

}
