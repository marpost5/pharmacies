package com.example.pharmacies.service.impl;

import com.example.pharmacies.model.Pharmacy;
import com.example.pharmacies.repository.PharmacyRepository;
import com.example.pharmacies.service.PharmacyService;

import java.util.List;

public class PharmacyServiceImpl implements PharmacyService {
    private final PharmacyRepository pharmacyRepository;

    public PharmacyServiceImpl(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }

    @Override
    public List<Pharmacy> listAllPharmacies() {
        return pharmacyRepository.findAll();
    }

    @Override
    public Pharmacy findById(Long id) {
        return pharmacyRepository.findById(id).orElseThrow();
    }

    @Override
    public Pharmacy findByName(String name) {
        return null;
    }

    @Override
    public List<Pharmacy> listAllPharmaciesByCity(String city) {
        return pharmacyRepository.findAllByLocation(city);
    }
}
