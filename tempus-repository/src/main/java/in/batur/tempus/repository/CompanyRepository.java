package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Company;

@Repository
@Transactional
public interface CompanyRepository extends BaseRepository<Company>
{

}
