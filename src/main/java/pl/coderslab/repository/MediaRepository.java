package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Media;

@Repository
public interface MediaRepository extends JpaRepository<Media, Long> {
}
