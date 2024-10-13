package com.lcwd.user.services.externelServices;

import com.lcwd.rating.RatingService.entities.Rating;
import com.lcwd.user.services.entities.Ratings;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient(name ="RATING-SERVICE")
public interface RatingService {

    @PostMapping("/ratings")
   public ResponseEntity<Ratings> createRating(Ratings values);

    @GetMapping("/ratings/{ratingId}")
    public ResponseEntity<Ratings> getRating(@PathVariable("ratingId") String ratingId, Ratings rating);

    @DeleteMapping("/ratingId/{ratingId}")
    public void deletRating(@PathVariable("ratingId") String ratingId);


}
