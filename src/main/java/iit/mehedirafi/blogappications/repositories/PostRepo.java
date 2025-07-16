package iit.mehedirafi.blogappications.repositories;

import iit.mehedirafi.blogappications.entities.Category;
import iit.mehedirafi.blogappications.entities.Post;
import iit.mehedirafi.blogappications.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Long> {

    List<Post> findByUser(User user);
    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);
}
