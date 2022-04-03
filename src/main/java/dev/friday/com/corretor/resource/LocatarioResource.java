package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Locatario;
import dev.friday.com.corretor.service.LocatarioService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/locatario")
@Api(tags = "Locatario API")
@CrossOrigin
@Log4j2
public class LocatarioResource {
    @Autowired
    private LocatarioService locatarioService;

    @Transactional
    @PostMapping("/insert")
    public void insertLocatario(@RequestBody Locatario locatario) {
        log.info("Inserindo Locatario: " + locatario);
        locatarioService.insertLocatario(locatario);
    }
}
