package pitt.edu.gmsapigatewayv1.domain.model.DAO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "air_temp_readings")
public class AirTempReadingDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "sensor_reading", nullable = false)
    private float airTempReading;

    @Column(name = "timestamp", nullable = false)
    private Instant timestamp;
}
