package com.example.demo.controller;

import com.example.demo.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class SampleController {

    @Autowired
    SampleService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String goIndex(){
        return "index";
    }


    @RequestMapping(value = "/test", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public @ResponseBody HashMap getTest(){
        return service.getData();
    }
}
