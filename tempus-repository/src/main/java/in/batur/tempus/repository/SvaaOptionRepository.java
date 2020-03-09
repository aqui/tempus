package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.SvaaOption;

@Repository
@Transactional
public interface SvaaOptionRepository extends BaseRepository<SvaaOption>
{

}
