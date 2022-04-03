package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Aluga;
import dev.friday.com.corretor.service.AlugaService;
import io.swagger.annotations.Api;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/aluga")
@Api(tags = "Aluga API")
@CrossOrigin
@Log4j2
public class AlugaResource {
    @Autowired
    private AlugaService alugaService;

    @Transactional
    @PostMapping("/insert")
    public void insertAluga(Aluga aluga) {
        alugaService.insertAluga(aluga);
    }
}
