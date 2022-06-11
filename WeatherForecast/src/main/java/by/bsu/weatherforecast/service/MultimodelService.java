package by.bsu.weatherforecast.service;

import by.bsu.weatherforecast.entity.Multimodel;
import by.bsu.weatherforecast.repository.MultimodelRepository;
import by.bsu.weatherforecast.service.dto.MultimodelDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MultimodelService {
    MultimodelRepository multimodelRepository;

    public MultimodelService(MultimodelRepository multimodelRepository) {
        this.multimodelRepository = multimodelRepository;
    }


    public Optional<Multimodel> findMultimodelById(int id) {
        return multimodelRepository.findMultimodelById(id);
    }

    public List<Multimodel> findAll() {
        return multimodelRepository.findAll();
    }

    public List<Multimodel> findAllByLocationId(int location_id) {
        return multimodelRepository.findAllByLocationId(location_id);
    }

    public Multimodel addMultimodel(MultimodelDTO multimodelDTO) {
        Multimodel multimodel = new Multimodel();
        multimodel.setDate(multimodelDTO.getDate());
        multimodel.setFc_date(multimodelDTO.getDate());
        multimodel.setId(multimodelDTO.getId());
        multimodel.setLocation(multimodelDTO.getLocation_id());
        multimodelRepository.save(multimodel);
        return multimodel;
    }

    public Optional<Multimodel> updateMultimodel(MultimodelDTO multimodelDTO) {
        return multimodelRepository.findMultimodelById(multimodelDTO.getId())
                .map(multimodel -> {
                    if (multimodelDTO.getDate() != null) multimodel.setDate(multimodelDTO.getDate());
                    if (multimodelDTO.getForecast_date() != null) multimodel.setFc_date(multimodelDTO.getForecast_date());
                    if (multimodelDTO.getLocation_id() != null) multimodel.setLocation(multimodelDTO.getLocation_id());
                    multimodel.setId(multimodelDTO.getId());
                    return multimodel;
                });
    }
}
