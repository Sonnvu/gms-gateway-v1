package pitt.edu.gmsapigatewayv1.domain.mapper;

import pitt.edu.gmsapigatewayv1.domain.model.DAO.AirTempReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.AirTempReadingDTO;
import pitt.edu.gmsapigatewayv1.domain.model.DTO.LightReadingDTO;

public class AirTempReadingMapper {
    public static AirTempReadingDTO mapToAirTempDTO(AirTempReadingDAO airTempReadingDAO) {
        return new AirTempReadingDTO(
                airTempReadingDAO.getId(),
                airTempReadingDAO.getAirTempReading(),
                airTempReadingDAO.getTimestamp(),
                airTempReadingDAO.getModuleId()
        );
    }

    public static AirTempReadingDAO mapToAirTempDAO(AirTempReadingDTO airTempReadingDTO) {
        return new AirTempReadingDAO(
                airTempReadingDTO.getId(),
                airTempReadingDTO.getAirTempReading(),
                airTempReadingDTO.getTimestamp(),
                airTempReadingDTO.getModuleId()
        );
    }
}
