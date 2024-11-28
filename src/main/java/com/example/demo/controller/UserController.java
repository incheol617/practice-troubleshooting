package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/v1/user")
@RestController
public class UserController {

  @GetMapping
  public ResponseEntity<String> getEmployeeNumber() {
    String employeeNumber = "82265825";
    log.info("Respond with employee number {}", employeeNumber);

    return new ResponseEntity<>(employeeNumber, HttpStatus.OK);
  }

}
