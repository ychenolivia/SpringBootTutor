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
        int[] nums = indexRepository.getNums();

        int target_ = Integer.parseInt(target);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target_ - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
