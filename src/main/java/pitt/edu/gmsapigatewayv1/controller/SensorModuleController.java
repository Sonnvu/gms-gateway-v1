package pitt.edu.gmsapigatewayv1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
