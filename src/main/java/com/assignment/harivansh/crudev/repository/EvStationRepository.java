package com.assignment.harivansh.crudev.repository;

import com.assignment.harivansh.crudev.model.EvStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EvStationRepository extends JpaRepository<EvStation, Long> {

}
