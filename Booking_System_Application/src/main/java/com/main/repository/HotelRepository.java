package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.models.HotelModel;


@Repository
public interface HotelRepository extends JpaRepository<HotelModel, Long> {

}
