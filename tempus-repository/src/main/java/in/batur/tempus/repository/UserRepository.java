package in.batur.tempus.repository;

import java.util.Optional;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import in.batur.tempus.entity.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Integer>
{
	Optional<User> findByUsername(String username);
}
