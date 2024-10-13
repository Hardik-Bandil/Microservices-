package com.lcwd.user.services.entities;

import lombok.*;

import javax.persistence.ManyToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Ratings {

    private String ratingId;

    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

    private Hotel hotel;
}
