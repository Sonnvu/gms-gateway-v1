package pitt.edu.gmsapigatewayv1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.SoilTempReadingDTO;
import pitt.edu.gmsapigatewayv1.service.SoilTempService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api_v1/sensor/temp/soil")
public class SoilTemperatureController {
    private SoilTempService SoilTempService;

    @PostMapping
    public ResponseEntity<SoilTempReadingDTO> addSoilTempReading(@RequestBody SoilTempReadingDTO SoilTempReadingDTO) {
        SoilTempReadingDTO savedSoilTempReadingDTO = SoilTempService.addSoilTempReading(SoilTempReadingDTO);
        return new ResponseEntity<>(savedSoilTempReadingDTO, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<SoilTempReadingDTO>> getAllSoilTempReadings() {
        List<SoilTempReadingDTO> Soil_temp_readings = SoilTempService.getAllSoilTempReadings();
        return ResponseEntity.ok(Soil_temp_readings);
    }

    @GetMapping("/all/{module_id}")
    public ResponseEntity<List<SoilTempReadingDTO>> getLightReadingsByModuleId(@PathVariable("module_id") long moduleId) {
        List<SoilTempReadingDTO> soil_temp_readings = SoilTempService.getSoilTempReadingsByModuleId(moduleId);
        return ResponseEntity.ok(soil_temp_readings);
    }
}
