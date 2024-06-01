package com.back_end.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Component
@Slf4j
public class Service {

    public String[] sortedList(String[] numbers){
        //Arrays.sort(numbers, Collections.reverseOrder());
        Arrays.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1).compareTo(Integer.valueOf(o2));
            }
        });
        log.info("Sorted array :{}", java.util.Arrays.toString(numbers));
        return numbers;
    }
}
