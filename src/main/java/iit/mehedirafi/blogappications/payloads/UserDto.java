package iit.mehedirafi.blogappications.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private Long id;
    @NotEmpty
    @Size(min=3,max=50, message = "Name must be contain minimum 3 and max 50 character")
    private String name;
    @NotEmpty
    @Email(message = "You email must be valid email")
    private String email;
    @NotNull
    @Size(min=8, message = "Password must be contain minimum 8 characters")
    private String password;
    @NotEmpty
    private String about;
}
