package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.RegrasCondominio;
import dev.friday.com.corretor.service.RegrasService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/regras")
@Api(tags = "Regras API")
@CrossOrigin
@Log4j2
public class RegrasResource {
    @Autowired
    private RegrasService service;

    @PostMapping("/insert")
    @Transactional
    public void insertRegras(@RequestBody RegrasCondominio regrasCondominio) {
        service.insertRegras(regrasCondominio);
    }

    @PostMapping("/update")
    @Transactional
    public void updateRegras(@RequestBody RegrasCondominio regrasCondominio) {
        service.updateRegras(regrasCondominio);
    }

    @PostMapping("/delete")
    @Transactional
    public void deleteRegras(@RequestParam Integer id) {
        service.deleteRegras(id);
    }
}
