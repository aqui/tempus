package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Code;

@Repository
@Transactional
public interface CodeRepository extends BaseRepository<Code>
{

}
