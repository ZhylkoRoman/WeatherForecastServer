package by.bsu.weatherforecast.repository;

import by.bsu.weatherforecast.entity.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {
    List<Model> findAllByMultimodelid(int multimodelid);
    List<Model> findAllByModelid(int modelid);
}
