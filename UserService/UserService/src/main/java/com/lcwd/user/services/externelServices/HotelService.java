package com.lcwd.user.services.externelServices;

import com.lcwd.user.services.entities.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name ="HOTEL-SERVICE")
public interface HotelService {

    @GetMapping("/hotelId/{hotelId}")
    Hotel getHotel(@PathVariable("hotelId") String hotelId);
}
