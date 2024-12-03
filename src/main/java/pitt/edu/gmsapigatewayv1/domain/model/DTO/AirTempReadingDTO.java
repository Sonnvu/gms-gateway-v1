package pitt.edu.gmsapigatewayv1.domain.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AirTempReadingDTO {
    private long id;
    // Getters and setters
    private float airTempReading;
    private Instant timestamp;
    private long moduleId;
}
