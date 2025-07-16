package iit.mehedirafi.blogappications.repositories;

import iit.mehedirafi.blogappications.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
