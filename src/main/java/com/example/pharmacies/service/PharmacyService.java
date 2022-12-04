package com.example.pharmacies.service;

import com.example.pharmacies.model.Pharmacy;

import java.util.List;

public interface PharmacyService {
    List<Pharmacy> listAllPharmacies();
    Pharmacy findById(Long id);
    Pharmacy findByName(String name);
    List<Pharmacy> listAllPharmaciesByCity(String city);
}
