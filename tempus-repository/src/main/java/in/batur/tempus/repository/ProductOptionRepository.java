package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ProductOption;

@Repository
@Transactional
public interface ProductOptionRepository extends BaseRepository<ProductOption>
{

}
