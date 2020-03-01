package pl.coderslab.service;

import org.springframework.stereotype.Service;
import pl.coderslab.model.Media;
import pl.coderslab.repository.MediaRepository;

import java.util.List;

@Service
public class MediaService {
    private final MediaRepository mediaRepository;

    public MediaService(MediaRepository mediaRepository) {
        this.mediaRepository = mediaRepository;
    }

    public void createMedia(Media media) {
        mediaRepository.save(media);
    }

    public Media readMedia(Long id) {
        return mediaRepository.findById(id).get();
    }

    public List<Media> readAllMedias() {
        return mediaRepository.findAll();
    }

    public void deleteMedia(Media media) {
        mediaRepository.delete(media);
    }
}
