package jar.controller;

import jar.dto.LoginRequest;
import jar.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {

        // temporary static login
        if(request.getUsername().equals("admin") &&
           request.getPassword().equals("admin123")) {

            return jwtUtil.generateToken(request.getUsername());
        }

        throw new RuntimeException("Invalid credentials");
    }
}
