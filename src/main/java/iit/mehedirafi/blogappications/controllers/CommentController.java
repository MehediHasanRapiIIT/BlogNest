package iit.mehedirafi.blogappications.controllers;


import iit.mehedirafi.blogappications.payloads.ApiResponse;
import iit.mehedirafi.blogappications.payloads.CommentDto;
import iit.mehedirafi.blogappications.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @PostMapping("/post/{postId}/comment")
    public ResponseEntity<CommentDto> createComment(
            @RequestBody CommentDto commentDto,
            @PathVariable long postId
    ) {
            CommentDto createComment = this.commentService.createComment(commentDto,postId);
            return new ResponseEntity<>(createComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comment/{commentId}")
    public ResponseEntity<ApiResponse> deleteComment(@PathVariable long commentId) {
        this.commentService.deleteComment(commentId);
        return new ResponseEntity<>(new ApiResponse("Comment Deleted Sucessfully",true), HttpStatus.OK);
    }
}
