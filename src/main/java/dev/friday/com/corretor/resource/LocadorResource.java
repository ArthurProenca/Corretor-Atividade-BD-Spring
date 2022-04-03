package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.*;
import dev.friday.com.corretor.service.LocadorService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/locador")
@Api(tags = "Locador API")
@CrossOrigin
@Log4j2
public class LocadorResource {

    @Autowired
    LocadorService locadorService;

    @Transactional
    @PostMapping("/insert")
    public void insertLocador(@RequestParam int cod_lcd, @RequestParam Boolean e_parceiro) {
        Locador locador = new Locador(cod_lcd, e_parceiro);
        locadorService.insertLocador(locador);
    }
}
