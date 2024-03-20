package com.pkl.poc.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
public class PklController {
    
    @GetMapping("/")
    public String home() {
        return "Welcome to PKL POC";
    }

    @GetMapping("/health")
    public ResponseEntity<JsonNode> health() throws JsonMappingException, JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        JsonNode json = mapper.readTree("{\"status\": \"ok\"}");
        return ResponseEntity.ok(json);
    }
}



