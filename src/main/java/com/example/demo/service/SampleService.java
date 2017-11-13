package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SampleService {

    public HashMap getData() {
        HashMap<String, String> map = new HashMap<>();
        map.put("test1", "1");

        return map;
    }
}
