package polsl.dietapp.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/auth")
public class AuthController {

    @PostMapping("/signin")
    public void SignIn(){

    }

    @PostMapping("/signup")
    public void SignUp(){

    }
}
