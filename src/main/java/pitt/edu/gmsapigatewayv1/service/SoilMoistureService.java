package pitt.edu.gmsapigatewayv1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pitt.edu.gmsapigatewayv1.domain.mapper.LightReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.mapper.SoilMoistureReadingMapper;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.SoilMoistureReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.SoilMoistureReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.repository.SoilMoistureRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class SoilMoistureService {
    private SoilMoistureRepository soilMoistureRepository;

    public SoilMoistureReadingDTO addSoilMoistureReading(SoilMoistureReadingDTO SoilMoistureReadingDTO) {
        SoilMoistureReadingDAO SoilMoistureReadingDAO = SoilMoistureReadingMapper.mapToSoilMoistureDAO(SoilMoistureReadingDTO);
        SoilMoistureReadingDAO savedSoilMoistureReadingDAO = soilMoistureRepository.save(SoilMoistureReadingDAO);
        return SoilMoistureReadingMapper.mapToSoilMoistureDTO(savedSoilMoistureReadingDAO);
    }

    public List<SoilMoistureReadingDTO> getAllSoilMoistureReadings() {
        List<SoilMoistureReadingDAO> Soil_Moisture_readings = soilMoistureRepository.findAll();
        return Soil_Moisture_readings.stream().map(SoilMoistureReadingMapper::mapToSoilMoistureDTO)
                .collect(Collectors.toList());
    }

    public List<SoilMoistureReadingDTO> getSoilMoistureReadingsByModuleId(long moduleId) {
        List<SoilMoistureReadingDAO> soil_moisture_readings = soilMoistureRepository.findByModuleId(moduleId);
        return soil_moisture_readings.stream()
                .map(SoilMoistureReadingMapper::mapToSoilMoistureDTO)
                .collect(Collectors.toList());
    }
}
