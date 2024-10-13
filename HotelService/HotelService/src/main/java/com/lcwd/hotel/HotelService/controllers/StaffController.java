package com.lcwd.hotel.HotelService.controllers;

import org.aspectj.weaver.patterns.HasMemberTypePatternForPerThisMatching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class StaffController {

    @GetMapping("/")
    public ResponseEntity<List<String>> getStaff(){
        List<String> list = Arrays.asList("hardiik", "bandil", "greatone", "fulfill");
        return new ResponseEntity<>(list, HttpStatus.OK);
    }
}
