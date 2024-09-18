package nl.smallproject.www.techiteasy.services;

import nl.smallproject.www.techiteasy.mappers.TelevisionMapper;
import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.models.TelevisionInputDto;
import nl.smallproject.www.techiteasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TelevisionService {
    private final TelevisionRepository televisionRepository;
    private final TelevisionMapper televisionMapper;

    public TelevisionService(TelevisionRepository televisionRepository, TelevisionMapper televisionMapper) {
        this.televisionRepository = televisionRepository;
        this.televisionMapper = televisionMapper;
    }

    public Television getTelevisionById(long id) {
        return televisionRepository.getReferenceById(id);
    }

    public TelevisionInputDto getTelevisionById(Long id) {
        Optional<Television> televisionOptional = televisionRepository.findById(id);

        if (televisionOptional.isPresent()) {
            Television television = televisionOptional.get();
            return televisionMapper.televisionEntityToInputDto(television);
        } else {
            throw new RuntimeException("Television not found");
        }
    }
}
