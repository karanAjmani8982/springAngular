package com.back_end.backend;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.StringTokenizer;

@RestController
@Slf4j
public class Controller {

    @Autowired
    Service service;

    @PostMapping("/sorting")
    public String[] sortedList(@RequestBody String unSortedArray){

        log.info("unSortedArray Array: {}", unSortedArray);
        //Creating a StringTokenizer object with delimiter ","
        StringTokenizer tokenizer = new StringTokenizer(unSortedArray, ",");

        int tokenCount = tokenizer.countTokens();
        String[] stringArray = new String[tokenCount];

        // Converting each token to array elements
        for (int i = 0; i < tokenCount; i++) {
            stringArray[i] = tokenizer.nextToken();
        }

        //String[] stringArray = unSortedArray.split(",");

        log.info("String Array: {}", java.util.Arrays.toString(stringArray));
        service.sortedList(stringArray);
        return stringArray;
    }
}
