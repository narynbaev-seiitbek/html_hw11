package kg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author seiitbeknarynbaev
 */
@Controller
public class GreetingsController {

    @GetMapping("/login")
    public String greetings() {
        return "greet/login";

    }

}
