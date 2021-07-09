package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.models.HotelModel;
import com.main.models.ReviewModel;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewModel, Long> {

}
