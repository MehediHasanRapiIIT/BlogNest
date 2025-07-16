package iit.mehedirafi.blogappications.services.impl;

import iit.mehedirafi.blogappications.entities.Comment;
import iit.mehedirafi.blogappications.entities.Post;
import iit.mehedirafi.blogappications.exceptions.ResourceNotFoundException;
import iit.mehedirafi.blogappications.payloads.CommentDto;
import iit.mehedirafi.blogappications.repositories.CommentRepo;
import iit.mehedirafi.blogappications.repositories.PostRepo;
import iit.mehedirafi.blogappications.services.CommentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private PostRepo postRepo;
    @Autowired
    private CommentRepo commentRepo;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CommentDto createComment(CommentDto commentDto, Long postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post not found","post Id",postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment, CommentDto.class);
    }

    @Override
    public void deleteComment(Long commentId) {
        Comment com = this.commentRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment not found","comment Id",commentId));
        this.commentRepo.delete(com);

    }
}
