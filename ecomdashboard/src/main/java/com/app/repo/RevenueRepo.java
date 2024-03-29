package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Revenue;

@Repository
public interface RevenueRepo extends JpaRepository<Revenue, Long> {

}
