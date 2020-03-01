package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Advice;
import pl.coderslab.repository.AdviceRepository;

import java.util.List;

@Service
public class AdviceService {
    private final AdviceRepository adviceRepository;

    public AdviceService(AdviceRepository adviceRepository) {
        this.adviceRepository = adviceRepository;
    }

    public Advice createAdvice(Advice advice) {
        return adviceRepository.save(advice);
    }

    public Advice readAdvice(Long id) {
        return adviceRepository.findById(id).get();
    }

    public List<Advice> readAllAdvices() {
        return adviceRepository.findAll();
    }

    public void deleteAdvice(Advice advice) {
        adviceRepository.delete(advice);
    }
}
