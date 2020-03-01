package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.converter.AdviceConverter;
import pl.coderslab.model.Advice;
import pl.coderslab.model.AdviceDto;
import pl.coderslab.service.AdviceService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AdviceController {
    private final AdviceService adviceService;
    private final AdviceConverter adviceConverter;

    public AdviceController(AdviceService adviceService, AdviceConverter adviceConverter) {
        this.adviceService = adviceService;
        this.adviceConverter = adviceConverter;
    }

    @GetMapping("/advices")
    public List<AdviceDto> getAdviceList() {
        List<Advice> advices = adviceService.readAllAdvices();
        return advices.stream().map(adviceConverter::convertToDto).collect(Collectors.toList());
    }

}
