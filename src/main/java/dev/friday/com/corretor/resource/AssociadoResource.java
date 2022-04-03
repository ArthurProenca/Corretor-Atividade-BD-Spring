package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Associado;
import dev.friday.com.corretor.service.AssociadoService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/associado")
@Api(tags = "Associado API")
@CrossOrigin
@Log4j2
public class AssociadoResource {
    @Autowired
    private AssociadoService associadoService;

    @Transactional
    @PostMapping("/insert")
    public void insertAssociado(@RequestBody Associado associado) {
        log.info("Inserindo associado");
        associadoService.insertAssociado(associado);
    }

    @Transactional
    @PostMapping("/update")
    public void updateAssociado(@RequestBody Associado associado) {
        log.info("Atualizando associado");
        associadoService.updateAssociado(associado);
    }

    @Transactional
    @PostMapping("/delete")
    public void deleteAssociado(@RequestParam Integer id) {
        log.info("Deletando associado");
        associadoService.deleteAssociado(id);
    }
}
