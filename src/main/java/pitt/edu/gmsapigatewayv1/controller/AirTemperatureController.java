package pitt.edu.gmsapigatewayv1.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.AirTempReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.service.AirTempService;
import pitt.edu.gmsapigatewayv1.service.LightService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api_v1/sensor/temp/air")
public class AirTemperatureController {
    private  AirTempService airTempService;

    @PostMapping
    public ResponseEntity<AirTempReadingDTO> addAirTempReading(@RequestBody AirTempReadingDTO airTempReadingDTO) {
        AirTempReadingDTO savedAirTempReadingDTO = airTempService.addAirTempReading(airTempReadingDTO);
        return new ResponseEntity<>(savedAirTempReadingDTO, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<AirTempReadingDTO>> getAllAirTempReadings() {
        List<AirTempReadingDTO> air_temp_readings = airTempService.getAllAirTempReadings();
        return ResponseEntity.ok(air_temp_readings);
    }

    @GetMapping("/all/{module_id}")
    public ResponseEntity<List<AirTempReadingDTO>> getAirTempReadingsByModuleId(@PathVariable("module_id") long moduleId) {
        List<AirTempReadingDTO> air_temp_readings = airTempService.getAirTempReadingsByModuleId(moduleId);
        return ResponseEntity.ok(air_temp_readings);
    }
}
