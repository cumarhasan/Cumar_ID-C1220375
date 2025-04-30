package just.ca227.C1220375;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class HelloController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the Spring Boot App!";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    @GetMapping("/success")
    public ResponseEntity<String> success() {
        return ResponseEntity.ok()
                .header("Custom-Header", "SuccessHeader")
                .body("Request Successful!");
    }

    @GetMapping("/not-found")
    public ResponseEntity<String> notFound() {
        return ResponseEntity.status(404).body("Resource Not Found");
    }

    @PostMapping("/create")
    public ResponseEntity<String> create() {
        return ResponseEntity.created(URI.create("/resource/1"))
                .body("Resource Created");
    }

}


