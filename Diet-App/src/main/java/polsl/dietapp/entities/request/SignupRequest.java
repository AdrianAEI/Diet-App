package polsl.dietapp.entities.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class SignupRequest {

    private String username;

    private String email;

    private String password;

    private Set<String> role;
}
