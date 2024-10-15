package com.lcwd.rating.RatingService.controller;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;



    @PostMapping("/{rating}")
    public ResponseEntity<Rating> create(@RequestBody Rating rating) {
         return  ResponseEntity.status(HttpStatus.CREATED).body(ratingService.create(rating));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Rating>> getRating() {
        return ResponseEntity.ok(ratingService.getRatings());
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<List<Rating>> getRatingUserId(String  userId) {
        return ResponseEntity.ok(ratingService.getRatingByUserId(userId));

    }

    @GetMapping("/hotels/{hotelId}")
    public ResponseEntity<List<Rating>> getHotelUserId( @PathVariable  String hotelId) {
        return ResponseEntity.ok(ratingService.getRatingByHotelId(hotelId));
    }



}
