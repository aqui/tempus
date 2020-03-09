package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.ProductFamily;

@Repository
@Transactional
public interface ProductFamilyRepository extends BaseRepository<ProductFamily>
{

}
