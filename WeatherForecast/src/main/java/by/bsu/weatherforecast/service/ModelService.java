package by.bsu.weatherforecast.service;

import by.bsu.weatherforecast.entity.Model;
import by.bsu.weatherforecast.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {
    ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public List<Model> findAllByMultimodelId(int multimodelid) {
        return modelRepository.findAllByMultimodelid(multimodelid);
    }

    public List<Model> findAllByModelId(int modelid) {
        return modelRepository.findAllByModelid(modelid);
    }
}
