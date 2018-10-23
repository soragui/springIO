
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.*;

@RestController
@EnableAutoConfiguration
public class HelloSpring {
    @RequestMapping("/")
    String home() {
        return "Hello, SpringBoot!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloSpring.class, args);
    }
}
