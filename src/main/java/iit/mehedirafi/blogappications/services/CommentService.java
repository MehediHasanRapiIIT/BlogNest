package iit.mehedirafi.blogappications.services;

import iit.mehedirafi.blogappications.payloads.CommentDto;

public interface CommentService {

    CommentDto createComment(CommentDto commentDto, Long postId);

    void deleteComment(Long commentId);
}
