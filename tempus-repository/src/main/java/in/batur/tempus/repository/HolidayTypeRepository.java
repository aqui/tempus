package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.HolidayType;

@Repository
@Transactional
public interface HolidayTypeRepository extends BaseRepository<HolidayType>
{

}
