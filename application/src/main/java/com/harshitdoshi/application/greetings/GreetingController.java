package com.harshitdoshi.application.greetings;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
// above is a short-hand for including the following: @Controller and @ResponseBody
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final UUID id = UUID.randomUUID();

    @GetMapping("/greeting")
    // instead of this, one can use a more geenral annotation like: @RequestMapping(method=GET)
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(id, String.format(template, name));
    }
}
