package pitt.edu.gmsapigatewayv1.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.service.LightService;

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
}
