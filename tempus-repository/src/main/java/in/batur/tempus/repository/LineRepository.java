package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Line;

@Repository
@Transactional
public interface LineRepository extends BaseRepository<Line>
{

}
