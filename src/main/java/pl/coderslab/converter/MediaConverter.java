package pl.coderslab.converter;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import pl.coderslab.model.Media;
import pl.coderslab.modelDto.MediaDto;

@Service
public class MediaConverter {
    private final ModelMapper modelMapper;

    public MediaConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public MediaDto convertToDto(Media media) {
        return modelMapper.map(media, MediaDto.class);
    }

    public Media convertToEntity(MediaDto mediaDto) {
        return modelMapper.map(mediaDto, Media.class);
    }
}
