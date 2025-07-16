package iit.mehedirafi.blogappications.payloads;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {


    private Long categoryId;

    @NotEmpty
    @Size(min = 4, message= "Length minimum 4 character")
    private String categoryTitle;

    @NotEmpty
    @Size(min = 20, message= "Length minimum 20 character")
    private String categoryDescription;
}
