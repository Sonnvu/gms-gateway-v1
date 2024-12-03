package pitt.edu.gmsapigatewayv1.domain.model.DAO;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "light_readings")
public class LightReadingDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sensor_reading", nullable = false)
    private float lightReading;

    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;

    @Column(name = "module_id", nullable = false)
    private long moduleId;
}
