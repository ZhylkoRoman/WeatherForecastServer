package by.bsu.weatherforecast.controller;

import by.bsu.weatherforecast.entity.Model;
import by.bsu.weatherforecast.service.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/model")
public class ModelController {
    ModelService modelService;

    public ModelController(ModelService modelService){
        this.modelService = modelService;
    }

    @GetMapping("/{modelid}")
    public ResponseEntity<List<Model>> getAllByModelId(@PathVariable int modelid) {
        return ResponseEntity.ok(modelService.findAllByModelId(modelid));
    }

    @GetMapping("/multimodel/{multimodelid}")
    public ResponseEntity<List<Model>> getAllByMultimodelId(@PathVariable int multimodelid) {
        return ResponseEntity.ok(modelService.findAllByMultimodelId(multimodelid));
    }
}
