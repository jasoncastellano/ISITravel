package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Hotel;

import java.util.List;

public interface IHotelRepository {
    public List<Hotel> getAll();
    public List<Hotel> getByName(String name);
    public List<Hotel> getByTravelId(int travelId);
}
