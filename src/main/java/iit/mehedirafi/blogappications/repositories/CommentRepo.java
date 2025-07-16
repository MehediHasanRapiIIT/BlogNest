package iit.mehedirafi.blogappications.repositories;

import iit.mehedirafi.blogappications.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {

}
