package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.Protection;

@Repository
@Transactional
public interface ProtectionRepository extends BaseRepository<Protection>
{

}
