package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Pessoa;
import dev.friday.com.corretor.service.CorretorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/public/v1/corretor-resource")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class CorretorResource {

    @Autowired
    private CorretorService corretorService;

    @GetMapping("/count")
    @ApiOperation(value = "Test", response = String.class)
    public ResponseEntity<Long> getCount(@RequestParam Long id){
        return ResponseEntity.ok(corretorService.getCount());
    }

    @GetMapping("/master")
    @ApiOperation(value = "Test", response = String.class)
    public List<Pessoa> findAll(@RequestParam Long id){
        return (corretorService.findAll());
    }

}
