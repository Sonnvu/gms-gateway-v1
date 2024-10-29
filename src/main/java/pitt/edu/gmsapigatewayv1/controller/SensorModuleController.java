package pitt.edu.gmsapigatewayv1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;

import java.time.Instant;

@RestController
public class SensorModuleController {
    public SensorModuleController() {}

    @GetMapping("")
    public String DisplayDefault() {
        return "Default Sensor Module API";
    }

    @GetMapping("/sensor")
    public String DisplayDefaultSensor() {
        return "Default Sensor Module API";
    }

    @GetMapping("/sensor/temperature")
    public String DisplayTempData() {
        return "Data Receive from Temperature Sensor:";
    }

    @GetMapping("/sensor/humidity")
    public String DisplayHumidityData() {
        return "Data Receive from Humidity Sensor";
    }

    @GetMapping("/sensor/soilph")
    public String DisplaySoilPH() {
        return "Data Receive from Soil PH Sensor";
    }

    @GetMapping("/sensor/soilmoisture")
    public String DisplaySoilMoisture() {
        return "Data Receive from Soil Moisture Sensor";
    }

    @GetMapping("/sensor/light")
    public ResponseEntity<String> receiveTemperature(@RequestBody LightReadingDTO request) {
        // Access the temperature and timestamp values
        float light = request.getLightReading();
        Instant timestamp = request.getTimestamp();

        // Process the data (e.g., store it, log it)
        System.out.println("Received temperature: " + light);
        System.out.println("Received timestamp: " + timestamp);

        // Return a success message
        return ResponseEntity.ok("Temperature and timestamp received successfully");
    }
}
