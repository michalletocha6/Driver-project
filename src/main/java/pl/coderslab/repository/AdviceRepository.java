package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Advice;
import pl.coderslab.model.AdviceShort;

@Repository
public interface AdviceRepository extends JpaRepository<AdviceShort, Long> {
}
