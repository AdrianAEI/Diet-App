package polsl.dietapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import polsl.dietapp.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
