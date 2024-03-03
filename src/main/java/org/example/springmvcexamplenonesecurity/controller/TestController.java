package org.example.springmvcexamplenonesecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/cont")
public class TestController {

    @GetMapping("/get")
    @ResponseBody
    public String get() {
        return "get";
    }

    @PostMapping("/post")
    @ResponseBody
    public String post() {
        return "post";
    }
}
