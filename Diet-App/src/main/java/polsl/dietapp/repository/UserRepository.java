package polsl.dietapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import polsl.dietapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
