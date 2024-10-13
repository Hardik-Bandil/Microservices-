package com.lcwd.user.services;

import com.lcwd.rating.RatingService.entities.Rating;

import com.lcwd.user.services.entities.Ratings;
import com.lcwd.user.services.externelServices.RatingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceApplicationTests {

	@Autowired
	private RatingService ratingService;

	@Test
	void contextLoads() {

	}

//	@Test
//	void createRating() {
//		Ratings ratings = Ratings.builder().ratingId("").userId("").feedback("this is a feedback").rating(10).build();
//        Ratings savedRating = ratingService.createRating(ratings);
//
//		System.out.println("new rating is creating");
//	}


}
