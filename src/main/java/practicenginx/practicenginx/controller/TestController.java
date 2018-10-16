package practicenginx.practicenginx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nginx")

public class TestController {
    @GetMapping("/{id}")
    public String test(@PathVariable("id") int id) {
        return "hello,springboot_1----" + id;
    }
    /*@RequestMapping("/")
    public String test() {
        return "hello,springboot_1----";
    }*/
}
