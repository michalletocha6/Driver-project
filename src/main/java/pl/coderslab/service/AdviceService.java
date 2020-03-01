package pl.coderslab.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Advice;
import pl.coderslab.repository.AdviceRepository;

import java.util.List;

@Service
public class AdviceService {
    private final AdviceRepository adviceRepository;
    private final ModelMapper modelMapper;

    public AdviceService(AdviceRepository adviceRepository, ModelMapper modelMapper) {
        this.adviceRepository = adviceRepository;
        this.modelMapper = modelMapper;
    }

    public void createAdvice(Advice advice) {
        adviceRepository.save(advice);
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
