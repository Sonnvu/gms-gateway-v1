package pitt.edu.gmsapigatewayv1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pitt.edu.gmsapigatewayv1.domain.mapper.AirTempReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.mapper.LightReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.AirTempReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.AirTempReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.repository.AirTempRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class AirTempService {
    private AirTempRepository airTempRepository;

    public AirTempReadingDTO addAirTempReading(AirTempReadingDTO airTempReadingDTO) {
        AirTempReadingDAO airTempReadingDAO = AirTempReadingMapper.mapToAirTempDAO(airTempReadingDTO);
        AirTempReadingDAO savedAirTempReadingDAO = airTempRepository.save(airTempReadingDAO);
        return AirTempReadingMapper.mapToAirTempDTO(savedAirTempReadingDAO);
    }

    public List<AirTempReadingDTO> getAllAirTempReadings() {
        List<AirTempReadingDAO> air_temp_readings = airTempRepository.findAll();
        return air_temp_readings.stream().map(AirTempReadingMapper::mapToAirTempDTO)
                .collect(Collectors.toList());
    }
}
