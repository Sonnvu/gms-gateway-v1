package pitt.edu.gmsapigatewayv1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.SoilMoistureReadingDTO;
import pitt.edu.gmsapigatewayv1.service.SoilMoistureService;
import pitt.edu.gmsapigatewayv1.service.SoilMoistureService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api_v1/sensor/soil/moisture")
public class SoilMoistureController {
    private SoilMoistureService soilMoistureService;

    @PostMapping
    public ResponseEntity<SoilMoistureReadingDTO> addSoilMoistureReading(@RequestBody SoilMoistureReadingDTO SoilMoistureReadingDTO) {
        SoilMoistureReadingDTO savedSoilMoistureReadingDTO = soilMoistureService.addSoilMoistureReading(SoilMoistureReadingDTO);
        return new ResponseEntity<>(savedSoilMoistureReadingDTO, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<SoilMoistureReadingDTO>> getAllSoilMoistureReadings() {
        List<SoilMoistureReadingDTO> Soil_Moisture_readings = soilMoistureService.getAllSoilMoistureReadings();
        return ResponseEntity.ok(Soil_Moisture_readings);
    }

    @GetMapping("/all/{module_id}")
    public ResponseEntity<List<SoilMoistureReadingDTO>> getSoilMoistureReadingsByModuleId(@PathVariable("module_id") long moduleId) {
        List<SoilMoistureReadingDTO> soil_moisture_readings = soilMoistureService.getSoilMoistureReadingsByModuleId(moduleId);
        return ResponseEntity.ok(soil_moisture_readings);
    }
}
