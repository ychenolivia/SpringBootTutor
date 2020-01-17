package com.example.demo.repository;

import com.example.demo.model.GivenIndex;
import org.springframework.stereotype.Repository;

@Repository
public class IndexRepository {
    int[] nums;

    public IndexRepository() {
        GivenIndex given = GivenIndex.builder()
                .ArrayofIndex(new int[]{2, 7, 11, 15})
                .build();

        nums = new int[]{2, 7, 11, 15};
    }
    public int[] getNums() {
        return nums;
    }

}
