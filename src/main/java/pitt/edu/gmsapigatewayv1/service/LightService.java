package pitt.edu.gmsapigatewayv1.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pitt.edu.gmsapigatewayv1.domain.mapper.LightReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.repository.LightRepository;

@Service
@AllArgsConstructor
public class LightService {

    private LightRepository lightRepository;
    public LightReadingDTO addLightReading(LightReadingDTO lightReadingDTO) {
        LightReadingDAO lightReadingDAO = LightReadingMapper.mapToLightReadingDAO(lightReadingDTO);
        LightReadingDAO savedLightReadingDAO = lightRepository.save(lightReadingDAO);
        return LightReadingMapper.mapToLightReadingDTO(savedLightReadingDAO);
    }
}
