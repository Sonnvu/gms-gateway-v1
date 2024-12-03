package pitt.edu.gmsapigatewayv1.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.LightReadingDAO;

import java.util.List;

@Repository
public interface LightRepository extends JpaRepository<LightReadingDAO, Long> {
    List<LightReadingDAO> findByModuleId(long moduleId);
}
