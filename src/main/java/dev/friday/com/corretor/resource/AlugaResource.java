package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Aluga;
import dev.friday.com.corretor.service.AlugaService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;

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
    public void insertAluga(@RequestParam Integer cod_imv, @RequestParam Integer cod_crt, @RequestParam Integer cod_lct, @RequestParam Date data_inicio, @RequestParam Date data_fim) {
        Aluga aluga = new Aluga(cod_imv, cod_crt, cod_lct, data_inicio, data_fim);
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


