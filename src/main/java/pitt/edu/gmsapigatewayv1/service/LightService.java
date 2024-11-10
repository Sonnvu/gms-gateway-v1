package pitt.edu.gmsapigatewayv1.service;

import lombok.AllArgsConstructor;
import org.hibernate.query.spi.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;
import pitt.edu.gmsapigatewayv1.domain.exception.ResourceNotFoundException;
import pitt.edu.gmsapigatewayv1.domain.mapper.LightReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.repository.LightRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class LightService {

    private LightRepository lightRepository;
    public LightReadingDTO addLightReading(LightReadingDTO lightReadingDTO) {
        LightReadingDAO lightReadingDAO = LightReadingMapper.mapToLightReadingDAO(lightReadingDTO);
        LightReadingDAO savedLightReadingDAO = lightRepository.save(lightReadingDAO);
        return LightReadingMapper.mapToLightReadingDTO(savedLightReadingDAO);
    }

    public LightReadingDTO getLightReadingById(Long lightReadingId) {
        LightReadingDAO lightReadingDAO = lightRepository.findById(lightReadingId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Light Entry does not exists with given ID: " + lightReadingId));
        return LightReadingMapper.mapToLightReadingDTO(lightReadingDAO);
    }

    public List<LightReadingDTO> getAllLightReadings() {
        List<LightReadingDAO> light_readings = lightRepository.findAll();
        return light_readings.stream().map(LightReadingMapper::mapToLightReadingDTO)
                .collect(Collectors.toList());
    }

}
