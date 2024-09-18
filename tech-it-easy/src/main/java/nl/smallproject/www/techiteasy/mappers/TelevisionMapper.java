package nl.smallproject.www.techiteasy.mappers;

import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.models.TelevisionInputDto;
import org.springframework.stereotype.Component;

@Component
public class TelevisionMapper {

    public Television televisionInputDtoToEntity(TelevisionInputDto televisionInputDto) {
        Television television = new Television();
        television.setName(televisionInputDto.getName());
        television.setBrand(televisionInputDto.getBrand());
        television.setPrice(televisionInputDto.getPrice());
        television.setCurrentStock(televisionInputDto.getCurrentStock());
        television.setHeight(televisionInputDto.getHeight());
        television.setWidth(televisionInputDto.getWidth());
        television.setScreenQuality(televisionInputDto.getScreenQuality());
        television.setScreenType(televisionInputDto.getScreenType());
        television.setWifi(televisionInputDto.getWifi());
        television.setSmartTv(televisionInputDto.getSmartTv());
        television.setVoiceControl(televisionInputDto.getVoiceControl());
        television.setHdr(televisionInputDto.getHdr());

        return television;
    }

    public TelevisionInputDto televisionEntityToInputDto(Television television) {
        TelevisionInputDto televisionInputDto = new TelevisionInputDto();
        televisionInputDto.setName(television.getName());
        televisionInputDto.setBrand(television.getBrand());
        televisionInputDto.setPrice(television.getPrice());
        televisionInputDto.setCurrentStock(television.getCurrentStock());
        televisionInputDto.setHeight(television.getHeight());
        televisionInputDto.setWidth(television.getWidth());
        televisionInputDto.setScreenQuality(television.getScreenQuality());
        televisionInputDto.setScreenType(television.getScreenType());
        televisionInputDto.setWifi(television.getWifi());
        televisionInputDto.setSmartTv(television.getSmartTv());
        televisionInputDto.setVoiceControl(television.getVoiceControl());
        televisionInputDto.setHdr(television.getHdr());

        return televisionInputDto;
    }

}
