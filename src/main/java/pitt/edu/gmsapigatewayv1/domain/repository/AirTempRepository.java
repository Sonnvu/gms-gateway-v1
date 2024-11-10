package pitt.edu.gmsapigatewayv1.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pitt.edu.gmsapigatewayv1.domain.model.DAO.AirTempReadingDAO;

@Repository
public interface AirTempRepository extends JpaRepository<AirTempReadingDAO, Long> {
}
