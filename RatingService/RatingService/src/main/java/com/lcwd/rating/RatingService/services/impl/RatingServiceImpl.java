package com.lcwd.rating.RatingService.services.impl;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.rating.RatingService.repository.RatingRepository;
import com.lcwd.rating.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;
    @Override
    public Rating create(Rating rating) {
        Random random = new Random();
        //random id number
        Integer newRandom = Math.abs(random.nextInt()); // Use absolute value to avoid negative IDs
        rating.setRatingId(newRandom);
       return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.getByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {

        return ratingRepository.findByHotelId(hotelId);
    }
}
