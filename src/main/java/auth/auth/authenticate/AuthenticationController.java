package auth.auth.authenticate;

import auth.auth.authenticate.Entities.AuthenticationRequest;
import auth.auth.authenticate.Entities.AuthenticationResponse;
import auth.auth.authenticate.Entities.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {
    @Autowired
    private  AuthenticationService authenticationService;

    @PostMapping("api/v1/auth/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(authenticationService.register(request));
    }

    @PostMapping("api/v1/auth/auth")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest register
    ){

        return ResponseEntity.ok(authenticationService.authenticate(register));
    }
}
