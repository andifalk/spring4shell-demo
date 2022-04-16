package com.example.spring4shelldemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greeting")
public class DemoRestController {

    private final Logger logger = LoggerFactory.getLogger("DemoRestController");

    @GetMapping
    public String helloGet(@RequestParam(name = "greeting", required = false) String msg) {
        logger.info("Greeting " + msg);
        return msg != null ? "Hello" + msg : "Hello World";
    }

    @PostMapping
    public String helloPost(@RequestBody Greeting msg) {
        logger.info("Greeting " + msg);
        return msg != null ? "Hello" + msg.getContent() : "Hello World";
    }

}
