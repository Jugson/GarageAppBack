package com.Gpro.GarageApp.repository;
import com.Gpro.GarageApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GarageRepository extends JpaRepository <Car, Long> {


}
