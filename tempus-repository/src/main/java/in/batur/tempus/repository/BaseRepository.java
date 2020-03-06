package in.batur.tempus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import in.batur.tempus.entity.BaseEntity;

@NoRepositoryBean
public interface BaseRepository <T extends BaseEntity> extends JpaRepository<T, Long> 
{
	public T findByVersion(Long version);
	public List<T> findAll();
}
