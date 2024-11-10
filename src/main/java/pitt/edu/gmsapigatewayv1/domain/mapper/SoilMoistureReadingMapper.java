package pitt.edu.gmsapigatewayv1.domain.mapper;

import pitt.edu.gmsapigatewayv1.domain.model.DAO.SoilMoistureReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.SoilMoistureReadingDTO;

public class SoilMoistureReadingMapper {
    public static SoilMoistureReadingDTO mapToSoilMoistureDTO(SoilMoistureReadingDAO SoilMoistureReadingDAO) {
        return new SoilMoistureReadingDTO(
                SoilMoistureReadingDAO.getId(),
                SoilMoistureReadingDAO.getSoilMoistureReading(),
                SoilMoistureReadingDAO.getTimestamp()
        );
    }

    public static SoilMoistureReadingDAO mapToSoilMoistureDAO(SoilMoistureReadingDTO SoilMoistureReadingDTO) {
        return new SoilMoistureReadingDAO(
                SoilMoistureReadingDTO.getId(),
                SoilMoistureReadingDTO.getSoilMoistureReading(),
                SoilMoistureReadingDTO.getTimestamp()
        );
    }
}
