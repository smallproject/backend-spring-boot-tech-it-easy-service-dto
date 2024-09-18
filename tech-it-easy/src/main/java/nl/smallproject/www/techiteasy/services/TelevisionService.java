package nl.smallproject.www.techiteasy.services;

import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

@Service
public class TelevisionService {
    private final TelevisionRepository televisionRepository;

    public TelevisionService(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    public Television getTelevisionById(long id) {
        return televisionRepository.getReferenceById(id);
    }
}
