package org.example.springmvcexamplenonesecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest")
public class TestRestController {

    @GetMapping("/get")
    public String get() {
        return "get";
    }

    @PostMapping("/post")
    public String post() {
        return "post";
    }
}
