package fr.mullerguillaume.gddit.repository;


import fr.mullerguillaume.gddit.model.Comment;
import fr.mullerguillaume.gddit.model.Post;
import fr.mullerguillaume.gddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
