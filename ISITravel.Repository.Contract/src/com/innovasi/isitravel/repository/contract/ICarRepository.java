package com.innovasi.isitravel.repository.contract;

import com.innovasi.isitravel.domain.Car;

import java.util.List;

public interface ICarRepository {
    public List<Car> getAll();
    public List<Car> getByTravelId(int travelId);
}
