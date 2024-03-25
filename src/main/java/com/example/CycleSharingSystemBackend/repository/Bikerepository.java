package com.example.CycleSharingSystemBackend.repository;

import com.example.CycleSharingSystemBackend.model.Bikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Bikerepository extends JpaRepository<Bikes, Long> {
}
