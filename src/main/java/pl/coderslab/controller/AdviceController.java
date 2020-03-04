package pl.coderslab.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.converter.AdviceConverter;
import pl.coderslab.model.Advice;
import pl.coderslab.model.AdviceShort;
import pl.coderslab.modelDto.AdviceDto;
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
        List<AdviceShort> advices = adviceService.readAllAdvices();
        return advices.stream().map(adviceConverter::convertToDto).collect(Collectors.toList());
    }

//    @GetMapping("/advice/{id}")
//    public AdviceDto getAdvice(@PathVariable Long id) {
//        return adviceConverter.convertToDto(adviceService.readAdvice(id));
//    }

//    @PostMapping("/createAdvice")
//    public AdviceDto createAdvice(@RequestBody AdviceDto adviceDto) {
//        Advice advice = adviceConverter.convertToEntity(adviceDto);
//        Advice adviceCreated = adviceService.createAdvice(advice);
//        return adviceConverter.convertToDto(adviceCreated);
//    }

//    @GetMapping("/removeAdvice/{id}")
//    public void removeAdvice(@PathVariable Long id) {
//        adviceService.deleteAdvice(adviceService.readAdvice(id));
//    }

}
