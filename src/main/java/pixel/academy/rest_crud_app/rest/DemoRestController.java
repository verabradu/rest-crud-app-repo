package pixel.academy.rest_crud_app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoRestController {

    // adaugam codul pentru endpoint-ul /hello
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World";
    }
}
