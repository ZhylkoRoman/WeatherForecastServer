package by.bsu.weatherforecast.controller;

import by.bsu.weatherforecast.entity.Location;
import by.bsu.weatherforecast.service.LocationService;
import by.bsu.weatherforecast.service.dto.LocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/location")
public class LocationController {
    LocationService locationService;

    public LocationController(LocationService locationService){
        this.locationService = locationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Location>> getLocation(@PathVariable int id) {
        return ResponseEntity.ok(
                locationService.findOneById(
                        id
                ));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Location>> getLocations() {
        return ResponseEntity.ok(
                locationService.findAll()
        );
    }

    @PostMapping("/add")
    public ResponseEntity<Location> addLocation(@RequestBody LocationDTO locationDTO) {
        return ResponseEntity.ok(locationService.addLocation(locationDTO));
    }

    @PostMapping("/update")
    public ResponseEntity<Optional<Location>> updateLocation(@RequestBody LocationDTO locationDTO) {
        return ResponseEntity.ok(locationService.updateLocation(locationDTO));
    }
}
