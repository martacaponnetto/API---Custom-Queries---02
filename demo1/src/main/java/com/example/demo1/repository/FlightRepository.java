package com.example.demo1.repository;

import com.example.demo1.entities.Flight;
import com.example.demo1.entities.FlightStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
 List<Flight> findByStatus (List<FlightStatus> statuses);


}
