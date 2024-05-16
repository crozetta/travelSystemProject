package com.tourismagency.pdv.repository;

import com.tourismagency.pdv.entity.CustomerProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<CustomerProfile, Long> {
}
