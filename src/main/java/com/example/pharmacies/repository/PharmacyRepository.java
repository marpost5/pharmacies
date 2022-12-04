package com.example.pharmacies.repository;

import com.example.pharmacies.model.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PharmacyRepository extends JpaRepository<Pharmacy,Long> {
    @Override
    List<Pharmacy> findAll();
    Pharmacy findById();
    List<Pharmacy> findAllByLocation(String location);
}
