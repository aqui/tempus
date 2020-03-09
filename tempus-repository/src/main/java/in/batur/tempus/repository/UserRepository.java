package in.batur.tempus.repository;

import java.util.Optional;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;
import in.batur.tempus.entity.User;

@Repository
@Transactional
public interface UserRepository extends BaseRepository<User>
{
	Optional<User> findByUsername(String username);
}
