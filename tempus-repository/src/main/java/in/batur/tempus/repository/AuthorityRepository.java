package in.batur.tempus.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.batur.tempus.entity.Authority;

@Repository
@Transactional
public interface AuthorityRepository extends BaseRepository<Authority>
{

}
