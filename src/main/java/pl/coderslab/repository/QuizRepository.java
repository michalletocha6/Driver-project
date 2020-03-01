package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.model.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {
}
