package iit.mehedirafi.blogappications.payloads;

import iit.mehedirafi.blogappications.entities.Category;
import iit.mehedirafi.blogappications.entities.Comment;
import iit.mehedirafi.blogappications.entities.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private Long id;
    private String title;
    private String content;
    private String imageName;
    private Date date;
    private UserDto user;
    private CategoryDto category;
    private Set<CommentDto> comments = new HashSet<CommentDto>();



}
