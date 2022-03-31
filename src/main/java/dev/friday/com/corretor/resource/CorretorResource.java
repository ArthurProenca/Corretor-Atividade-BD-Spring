package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Corretor;
import dev.friday.com.corretor.entity.Pessoa;
import dev.friday.com.corretor.service.CorretorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/v1/corretor-resource/corretor")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class CorretorResource {
    @Autowired
    private CorretorService corretorService;

    @GetMapping("/all")
    @ApiOperation(value = "Get in table corretor all tuples")
    public Iterable<Corretor> getAllCorretor(){
        return corretorService.getAll();
    }

    @PostMapping("/insert")
    @ApiOperation(value = "Insert Corretor into DB")
    public void insertCorretor(@RequestBody Corretor corretor){
        corretorService.insertInto(corretor);
    }
}
