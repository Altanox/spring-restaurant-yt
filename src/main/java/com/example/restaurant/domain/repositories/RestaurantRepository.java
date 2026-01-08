package com.example.restaurant.domain.repositories;

import com.example.restaurant.domain.entities.Restaurant;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

// Get access o CRUD operations
@Repository
public interface RestaurantRepository extends ElasticsearchRepository<Restaurant, String> {

    //TODO: custom queries
}
