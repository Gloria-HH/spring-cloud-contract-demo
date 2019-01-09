package com.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


/**
 * Created by gloria on 15/12/2018.
 */
@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user", method = POST)
    public String user(String id) {
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
        Map<String, String> hashmap = new LinkedHashMap<String, String>();
        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<Map<String, String>>(hashmap, httpHeaders);
        ResponseEntity<String> resp = restTemplate.exchange("http://localhost:8088/getUserById/"+id, HttpMethod.POST, requestEntity, String.class);
        return resp.getBody();
    }



}
