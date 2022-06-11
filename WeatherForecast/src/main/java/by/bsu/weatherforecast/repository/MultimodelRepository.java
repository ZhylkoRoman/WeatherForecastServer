package by.bsu.weatherforecast.repository;

import by.bsu.weatherforecast.entity.Multimodel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MultimodelRepository extends JpaRepository<Multimodel, Integer> {
    Optional<Multimodel> findMultimodelById(int id);
    List<Multimodel> findAll();
    List<Multimodel> findAllByLocationId(int location_id);
}
