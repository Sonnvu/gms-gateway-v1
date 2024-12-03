package pitt.edu.gmsapigatewayv1.domain.mapper;

import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;

public class LightReadingMapper {
    public static LightReadingDTO mapToLightReadingDTO(LightReadingDAO lightReadingDAO) {
        return new LightReadingDTO(
                lightReadingDAO.getId(),
                lightReadingDAO.getLightReading(),
                lightReadingDAO.getTimestamp(),
                lightReadingDAO.getModuleId()
        );
    }

    public static LightReadingDAO mapToLightReadingDAO(LightReadingDTO lightReadingDTO) {
        return new LightReadingDAO(
                lightReadingDTO.getId(),
                lightReadingDTO.getLightReading(),
                lightReadingDTO.getTimestamp(),
                lightReadingDTO.getModuleId()
        );
    }
}
