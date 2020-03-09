package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.CodeTable;

@Repository
@Transactional
public interface CodeTableRepository extends BaseRepository<CodeTable>
{

}
