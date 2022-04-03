package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Telefone;
import dev.friday.com.corretor.service.TelefoneService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/telefone")
@Api(tags = "Telefone API")
@CrossOrigin
@Log4j2
public class TelefoneResource {
    @Autowired
    TelefoneService telefoneService;

    @Transactional
    @PostMapping("/insert")
    public void insertTelefone(@RequestBody Telefone telefone) {
        log.info("Inserindo telefone: " + telefone);
        telefoneService.insertTelefone(telefone);
    }

    @Transactional
    @PostMapping("/update")
    public void updateTelefone(@RequestBody Telefone telefone) {
        log.info("Atualizando telefone: " + telefone);
        telefoneService.updateTelefone(telefone);
    }

    @Transactional
    @PostMapping("/delete")
    public void deleteTelefone(@RequestParam Integer id) {
        log.info("Deletando telefone: " + id);
        telefoneService.deleteTelefone(id);
    }
}