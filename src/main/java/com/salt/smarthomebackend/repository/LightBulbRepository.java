package com.salt.smarthomebackend.repository;

import com.salt.smarthomebackend.model.LightBulb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightBulbRepository extends JpaRepository<LightBulb, Long> {
}