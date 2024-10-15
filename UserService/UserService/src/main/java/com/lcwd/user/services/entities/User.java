package com.lcwd.user.services.entities;

import com.lcwd.rating.RatingService.entities.Rating;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {

    @Id
    private String userId;

    @Column(name ="Name")
    private String name ;

    @Column(name="Email")
    private String email;

    @Column(name="About")
    private String about;

    @Transient
    private List<Rating> ratings;

}
