package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.CorretorLocador;
import dev.friday.com.corretor.service.CorretorLocadorService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/corretor/locador")
@Api(tags = "CorretorLocador API")
@CrossOrigin
@Log4j2
public class CorretorLocadorResource {

    @Autowired
    private CorretorLocadorService corretorLocadorService;

    @Transactional
    @PostMapping("/insert")
    public void insertCorretorLocador(@RequestBody CorretorLocador corretorLocador) {
        log.info("Inserindo corretor locador");
        corretorLocadorService.insertCorretorLocador(corretorLocador);
    }

    @Transactional
    @PostMapping("/update")
    public void updateCorretorLocador(@RequestBody CorretorLocador corretorLocador) {
        log.info("Atualizando corretor locador");
        corretorLocadorService.updateCorretorLocador(corretorLocador);
    }

    @Transactional
    @PostMapping("/delete")
    public void deleteCorretorLocador(@RequestParam Integer id) {
        log.info("Deletando corretor locador");
        corretorLocadorService.deleteCorretorLocador(id);
    }
}
