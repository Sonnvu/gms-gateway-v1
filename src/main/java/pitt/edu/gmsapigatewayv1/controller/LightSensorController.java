package pitt.edu.gmsapigatewayv1.controller;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.service.LightService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api_v1/sensor/light")
public class LightSensorController {
    private LightService lightService;

    @PostMapping
    public ResponseEntity<LightReadingDTO> addLightReading(@RequestBody LightReadingDTO lightReadingDTO) {
        LightReadingDTO savedLightReadingDTO = lightService.addLightReading(lightReadingDTO);
        return new ResponseEntity<>(savedLightReadingDTO, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<LightReadingDTO> getLightReadingById(@PathVariable("id") Long lightReadingId) {
        LightReadingDTO lightReadingDTO = lightService.getLightReadingById(lightReadingId);
        return ResponseEntity.ok(lightReadingDTO);
    }

    @GetMapping("/all")
    public ResponseEntity<List<LightReadingDTO>> getAllLightReadings() {
        List<LightReadingDTO> light_readings = lightService.getAllLightReadings();
        return ResponseEntity.ok(light_readings);
    }

    @GetMapping("/all/{module_id}")
    public ResponseEntity<List<LightReadingDTO>> getLightReadingsByModuleId(@PathVariable("module_id") long moduleId) {
        List<LightReadingDTO> lightReadings = lightService.getLightReadingsByModuleId(moduleId);
        return ResponseEntity.ok(lightReadings);
    }

    @GetMapping("/graph")
    public ResponseEntity<List<LightReadingDTO>> getTopFiftyLightReadings() {
        return null;
    }
}
