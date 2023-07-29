package polsl.dietapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import polsl.dietapp.entities.ERole;
import polsl.dietapp.entities.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
