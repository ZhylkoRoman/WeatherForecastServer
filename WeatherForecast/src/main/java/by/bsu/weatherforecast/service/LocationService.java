package by.bsu.weatherforecast.service;


import by.bsu.weatherforecast.entity.Location;
import by.bsu.weatherforecast.repository.LocationRepository;
import by.bsu.weatherforecast.service.dto.LocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public Optional<Location> findOneById(int id) {
        return locationRepository.findOneById(id);
    }

    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    public Location addLocation(LocationDTO locationDTO) {
        Location location = new Location();
        location.setLocation(locationDTO.getLocation());
        location.setId(locationDTO.getId());
        location.setModel(locationDTO.getModel());
        locationRepository.save(location);
        return location;
    }

    public Optional<Location> updateLocation(LocationDTO locationDTO) {
        return locationRepository.findOneById(locationDTO.getId())
                .map(location -> {
                    if (locationDTO.getLocation() != null) location.setLocation(locationDTO.getLocation());
                    location.setModel(locationDTO.getModel());
                    location.setId(locationDTO.getId());
                    return location;
                })
                .map(locationRepository::save);
    }
}
