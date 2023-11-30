package com.example.kafkapractice.controller;

import com.example.kafkapractice.model.Order;
import com.example.kafkapractice.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    
    @Autowired
    ProducerService producerService;
    @PostMapping("/kafka/publish")
    @ResponseBody
    public ResponseEntity<String> publishData(@RequestBody final Order data){
        producerService.sendMessage(data);
        return new ResponseEntity<>("published", HttpStatus.OK);
        
    }
}
