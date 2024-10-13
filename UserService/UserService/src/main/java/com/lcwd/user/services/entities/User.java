package com.lcwd.user.services.entities;

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
    private int userId;

    @Column(name ="Name")
    private String name ;

    @Column(name="Email")
    private String email;

    @Column(name="About")
    private String about;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



}
