package com.website.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RootController {


    @GetMapping(value="/")
    public String rootMap(){
        return "Hello Spring! auto load after change";
    }

    @RequestMapping(value="/test", method= RequestMethod.GET)
    public String testURL(){
        return "Hello testURL!";
    }
}
