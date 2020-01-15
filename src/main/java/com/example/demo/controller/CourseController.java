package com.example.demo.controller;

import com.example.demo.service.TwoSum;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class CourseController {
    @Autowired
    TwoSum twoSum;

    @GetMapping(path = "/look-up/{inputString}", produces = "application/json")
    public HttpEntity FindIndex(@PathVariable("inputString") String inputString) {
        int[] res = twoSum.getIndex(inputString);

        return new ResponseEntity(res, HttpStatus.OK);
    }
}
