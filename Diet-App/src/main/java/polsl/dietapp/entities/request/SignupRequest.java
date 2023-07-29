package polsl.dietapp.entities.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import polsl.dietapp.entities.Role;

@Getter
@Setter
@AllArgsConstructor
public class SignupRequest {

    private String username;

    private String password;

    private String email;

    private Role role;
}
