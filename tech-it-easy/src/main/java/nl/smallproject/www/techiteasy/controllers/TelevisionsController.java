package nl.smallproject.www.techiteasy.controllers;

import nl.smallproject.www.techiteasy.models.Television;
import nl.smallproject.www.techiteasy.services.TelevisionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/television")
public class TelevisionsController {
    private final TelevisionService televisionService;

    public TelevisionsController(TelevisionService televisionService) {
        this.televisionService = televisionService;
    }

    @GetMapping
    public ResponseEntity<Television> getTelevisionById(long id) {
        Television television = televisionService.getTelevisionById(id);
        return ResponseEntity.ok(television);
    }

}
