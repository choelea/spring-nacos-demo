package tech.icoding.springnacosdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping("/demo")
    @ResponseBody
    public ResponseEntity<?> get() {
        return ResponseEntity.ok("success");
    }
}