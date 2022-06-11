package by.bsu.weatherforecast.repository;


import by.bsu.weatherforecast.entity.Location;
import by.bsu.weatherforecast.service.dto.LocationDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {
    Optional<Location> findOneById(int id);
    List<Location> findAll();
}
