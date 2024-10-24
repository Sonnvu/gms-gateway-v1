package pitt.edu.gmsapigatewayv1.domain.model;

import java.time.Instant;

public class LightRequest {
    private float lightReading;
    private Instant timestamp;

    // Getters and setters
    public float getLightReading() {
        return lightReading;
    }

    public void setLightReading(float lightReading) {
        this.lightReading = lightReading;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
}
