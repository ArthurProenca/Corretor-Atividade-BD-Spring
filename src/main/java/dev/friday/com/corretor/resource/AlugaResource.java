package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Aluga;
import dev.friday.com.corretor.service.AlugaService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/aluga")
@Api(tags = "Aluga API")
@CrossOrigin
@Log4j2
public class AlugaResource {
    @Autowired
    private AlugaService alugaService;

    @PostMapping("/insert")
    @Transactional
    public void insertAluga(@RequestBody Aluga aluga) {
        alugaService.insertAluga(aluga);
    }

    @PostMapping("/update")
    @Transactional
    public void updateAluga(@RequestBody Aluga aluga) {
        alugaService.updateAluga(aluga);
    }

    @PostMapping("/delete")
    @Transactional
    public void deleteAluga(@RequestParam Integer id) {
        alugaService.deleteAluga(id);
    }
}


