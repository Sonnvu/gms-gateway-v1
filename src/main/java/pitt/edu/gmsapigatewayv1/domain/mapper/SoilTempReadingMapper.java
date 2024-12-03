package pitt.edu.gmsapigatewayv1.domain.mapper;

import pitt.edu.gmsapigatewayv1.domain.model.DAO.SoilTempReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.SoilTempReadingDTO;

public class SoilTempReadingMapper {
    public static SoilTempReadingDTO mapToSoilTempDTO(SoilTempReadingDAO SoilTempReadingDAO) {
        return new SoilTempReadingDTO(
                SoilTempReadingDAO.getId(),
                SoilTempReadingDAO.getSoilTempReading(),
                SoilTempReadingDAO.getTimestamp(),
                SoilTempReadingDAO.getModuleId()
        );
    }

    public static SoilTempReadingDAO mapToSoilTempDAO(SoilTempReadingDTO SoilTempReadingDTO) {
        return new SoilTempReadingDAO(
                SoilTempReadingDTO.getId(),
                SoilTempReadingDTO.getSoilTempReading(),
                SoilTempReadingDTO.getTimestamp(),
                SoilTempReadingDTO.getModuleId()
        );
    }
}
