package by.bsu.weatherforecast.controller;


import by.bsu.weatherforecast.entity.Multimodel;
import by.bsu.weatherforecast.service.MultimodelService;
import by.bsu.weatherforecast.service.dto.MultimodelDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/multimodel")
public class MultimodelController {

    MultimodelService multimodelService;

    public MultimodelController(MultimodelService multimodelService){
        this.multimodelService = multimodelService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Multimodel>> getMultimodel(@PathVariable int id) {
        return ResponseEntity.ok(
                multimodelService.findMultimodelById(
                        id
                ));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Multimodel>> getMultimodels() {
        return ResponseEntity.ok(
                multimodelService.findAll()
        );
    }

    @GetMapping("/location/{location_id}")
    public ResponseEntity<List<Multimodel>> getAllByLocationId(@PathVariable int location_id) {
        return ResponseEntity.ok(
                multimodelService.findAllByLocationId(location_id)
        );
    }

    @PostMapping("/add")
    public ResponseEntity<Multimodel> addMultimodel(@RequestBody MultimodelDTO mUltimodelDTO) {
        return ResponseEntity.ok(multimodelService.addMultimodel(mUltimodelDTO));
    }

    @PostMapping("/update")
    public ResponseEntity<Optional<Multimodel>> updateMultimodel(@RequestBody MultimodelDTO multimodelDTO) {
        return ResponseEntity.ok(multimodelService.updateMultimodel(multimodelDTO));
    }
}
