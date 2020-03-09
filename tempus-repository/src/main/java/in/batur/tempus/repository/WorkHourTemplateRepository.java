package in.batur.tempus.repository;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.stereotype.Repository;

import in.batur.tempus.entity.WorkHourTemplate;

@Repository
@Transactional
public interface WorkHourTemplateRepository extends BaseRepository<WorkHourTemplate>
{

}
