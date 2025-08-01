package iit.mehedirafi.blogappications.repositories;

import iit.mehedirafi.blogappications.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
