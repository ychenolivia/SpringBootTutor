package com.example.demo.repository;

import com.example.demo.model.GivenIndex;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IndexRepository {
    int[] nums;

    public IndexRepository() {
        GivenIndex given = GivenIndex.builder()
                .ArrayofIndex(new int[]{2, 7, 11, 15})
                .build();

        nums = new int[]{2, 7, 11, 15};
    }

    public int[] FindIndex(String target) {
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
