package pitt.edu.gmsapigatewayv1.domain.model;

import jakarta.persistence.Entity;

import java.time.Instant;

public class TemperatureReading {
    private float temperature;
    private Instant timestamp;

    // Getters and setters
    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
