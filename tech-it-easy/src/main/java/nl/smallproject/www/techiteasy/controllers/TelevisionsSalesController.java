package nl.smallproject.www.techiteasy.controllers;

import nl.smallproject.www.techiteasy.dtos.TelevisionSalesOutputDto;
import nl.smallproject.www.techiteasy.services.TelevisionSalesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/sales/television")
public class TelevisionsSalesController {
    private final TelevisionSalesService televisionSalesService;

    public TelevisionsSalesController(TelevisionSalesService televisionSalesService) {
        this.televisionSalesService = televisionSalesService;
    }

    @GetMapping("{id}")
    public ResponseEntity<TelevisionSalesOutputDto> getTelevisionById(@PathVariable Long id) {
        TelevisionSalesOutputDto televisionSalesOutputDto = televisionSalesService.getTelevisionById(id);
        return ResponseEntity.ok(televisionSalesOutputDto);
    }
}
