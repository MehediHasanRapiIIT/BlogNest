package iit.mehedirafi.blogappications.payloads;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommentDto {

    private long id;
    private String content;
}
