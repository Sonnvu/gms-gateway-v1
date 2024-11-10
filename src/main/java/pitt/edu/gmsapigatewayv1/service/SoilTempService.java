package pitt.edu.gmsapigatewayv1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pitt.edu.gmsapigatewayv1.domain.mapper.SoilTempReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.SoilTempReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.SoilTempReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.repository.SoilTempRepository;
import pitt.edu.gmsapigatewayv1.domain.repository.SoilTempRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SoilTempService {
    private SoilTempRepository soilTempRepository;

    public SoilTempReadingDTO addSoilTempReading(SoilTempReadingDTO SoilTempReadingDTO) {
        SoilTempReadingDAO SoilTempReadingDAO = SoilTempReadingMapper.mapToSoilTempDAO(SoilTempReadingDTO);
        SoilTempReadingDAO savedSoilTempReadingDAO = soilTempRepository.save(SoilTempReadingDAO);
        return SoilTempReadingMapper.mapToSoilTempDTO(savedSoilTempReadingDAO);
    }

    public List<SoilTempReadingDTO> getAllSoilTempReadings() {
        List<SoilTempReadingDAO> Soil_temp_readings = soilTempRepository.findAll();
        return Soil_temp_readings.stream().map(SoilTempReadingMapper::mapToSoilTempDTO)
                .collect(Collectors.toList());
    }
}
