package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Corretor;
import dev.friday.com.corretor.entity.CorretorLocador;
import dev.friday.com.corretor.service.CorretorService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/corretor")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class CorretorResource {

    @Autowired
    CorretorService corretorService;


    @Transactional
    @PostMapping("/insert")
    public void insertCorretor(@RequestBody Corretor corretor) {
        log.info("Inserindo corretor");
        corretorService.insertCorretor(corretor);
    }

}
