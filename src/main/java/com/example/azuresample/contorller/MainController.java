package com.example.azuresample.contorller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/v1")
public class MainController {

    @RequestMapping("/current-time")
    public ResponseEntity<?> getCurrentTime(){

        return ResponseEntity.ok(new Date());
    }
}
