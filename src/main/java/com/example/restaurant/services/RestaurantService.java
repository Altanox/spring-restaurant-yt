package com.example.restaurant.services;

import com.example.restaurant.domain.RestaurantCreateUpdateRequest;
import com.example.restaurant.domain.entities.Restaurant;

public interface RestaurantService {

    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);
}
