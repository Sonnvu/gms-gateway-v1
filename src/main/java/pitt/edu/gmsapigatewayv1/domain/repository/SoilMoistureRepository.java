package pitt.edu.gmsapigatewayv1.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.SoilMoistureReadingDAO;

import java.util.List;

@Repository
public interface SoilMoistureRepository extends JpaRepository<SoilMoistureReadingDAO, Long> {
    List<SoilMoistureReadingDAO> findByModuleId(long moduleId);
}
