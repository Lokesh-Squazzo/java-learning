package com.lokesh.FirstProj;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    @GetMapping("/hello")
    String helloPage()    {
        return "<h1>hello this is hello page</h1>" +
                "<h3><a href='welcome'>Click here for welcome</a>";
    }
    @GetMapping("/welcome")
    String welcomePage(){
        return "<h1>Welcome Guys";

    }
}
