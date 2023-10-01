package auth.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AuthApplication {

    public static void main(String[] args) {

        SpringApplication.run(AuthApplication.class, args);
    }

    @GetMapping("api/v1/test-get")
    public ResponseEntity<String> testGet(){
        return ResponseEntity.ok(">>>> In main-controller");
    }
    @PostMapping("api/v1/test-post")
    public ResponseEntity<String>testPost() {
        return ResponseEntity.ok(">>> Post Works");
    }

}
