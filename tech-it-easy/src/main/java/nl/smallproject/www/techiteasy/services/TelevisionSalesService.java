package nl.smallproject.www.techiteasy.services;

import nl.smallproject.www.techiteasy.dtos.TelevisionSalesOutputDto;
import nl.smallproject.www.techiteasy.mappers.TelevisionSalesMapper;
import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.repositories.TelevisionRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TelevisionSalesService {

    private final TelevisionRepository televisionRepository;
    private final TelevisionSalesMapper televisionSalesMapper;

    public TelevisionSalesService(TelevisionRepository televisionRepository, TelevisionSalesMapper televisionSalesMapper) {
        this.televisionRepository = televisionRepository;
        this.televisionSalesMapper = televisionSalesMapper;
    }

    public TelevisionSalesOutputDto getTelevisionById(Long id) {
        Optional<Television> televisionOptional = televisionRepository.findById(id);

        if (televisionOptional.isPresent()) {
            Television television = televisionOptional.get();
            return televisionSalesMapper.televisionSalesEntityToOutputDto(television);
        } else {
            throw new RuntimeException("Television not found");
        }
    }
}
