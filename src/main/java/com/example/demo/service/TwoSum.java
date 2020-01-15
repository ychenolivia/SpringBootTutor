package com.example.demo.service;

import com.example.demo.controller.CourseController;
import com.example.demo.repository.IndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class TwoSum {
    @Autowired
    IndexRepository indexRepository;

    public int[] getIndex(String target) {
        return indexRepository.FindIndex(target);
    }
}
