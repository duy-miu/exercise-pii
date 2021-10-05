/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.exercisepi.controller;

import com.example.exercisepi.model.Dog;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author test
 */
@RestController
public class Parser {

    @RequestMapping(value = "/getResult", method = RequestMethod.GET, produces = {"application/json"})
    public ResponseEntity<Dog[]> parseData() {
        System.out.println("Parsing data ...");
        String url = "https://raw.githubusercontent.com/mlenze/CodingExcercise-Java/main/apidata.json";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity< Dog[]> result = restTemplate.getForEntity(url, Dog[].class);

        return result;
    }
}
