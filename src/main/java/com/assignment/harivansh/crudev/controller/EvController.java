package com.assignment.harivansh.crudev.controller;

import com.assignment.harivansh.crudev.exception.ResourceNotFoundException;
import com.assignment.harivansh.crudev.model.EvStation;
import com.assignment.harivansh.crudev.repository.EvStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController()
@RequestMapping("/api/ev")
public class EvController {
    @Autowired
    private EvStationRepository evStationRepository;

    // getAllEVStations
    @GetMapping
    public List<EvStation> getAllEvStations(){
        return evStationRepository.findAll();
    }

    // Create Ev Station Listing
    @PostMapping
    public EvStation createEvStation(@RequestBody EvStation evStation){
        return evStationRepository.save(evStation);
    }

    // get a single ev station
    @GetMapping("/show/{id}")
    public ResponseEntity<EvStation> getEvStation(@PathVariable long id){
        EvStation evStation = evStationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ev station does not exits"));
        return ResponseEntity.ok(evStation);
    }

    // update ev station listing
    @PutMapping("{id}/edit")
    public ResponseEntity<EvStation> updateEvStation(@PathVariable long id, @RequestBody EvStation evStation){
        EvStation updatedEvStation = evStationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ev station does not exits"));

        updatedEvStation.setStationName(evStation.getStationName());
        updatedEvStation.setStationImage(evStation.getStationImage());
        updatedEvStation.setStationAddress(evStation.getStationAddress());
        updatedEvStation.setStationPricing(evStation.getStationPricing());

        evStationRepository.save(updatedEvStation);
        return ResponseEntity.ok(updatedEvStation);
    }

    // delete a ev station listing
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<HttpStatus> deleteEvStation(@PathVariable long id){
        EvStation evStation = evStationRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Ev station does not exits"));
        evStationRepository.delete(evStation);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
