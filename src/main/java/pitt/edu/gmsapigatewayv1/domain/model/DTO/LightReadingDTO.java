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
public class LightReadingDTO {
    private long id;
    // Getters and setters
    private float lightReading;
    private Instant timestamp;
}
