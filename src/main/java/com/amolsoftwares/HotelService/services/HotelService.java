package com.amolsoftwares.HotelService.services;

import com.amolsoftwares.HotelService.entities.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel create(Hotel hotel);

    //getAll
    List<Hotel> getAll();

    //getSingle
    Hotel get(String id);

}
