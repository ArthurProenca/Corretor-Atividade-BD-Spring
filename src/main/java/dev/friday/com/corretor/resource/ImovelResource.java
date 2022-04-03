package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Imovel;
import dev.friday.com.corretor.service.ImovelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/v1/corretor-resource/imovel")
@Api(tags = "Imovel API")
@CrossOrigin
@Log4j2
public class ImovelResource {

    @Autowired
    ImovelService imovelService;

    @PostMapping("/insert")
    @ApiOperation(value = "Get in table corretor all tuples")
    public void insertImovel(@RequestBody Imovel imovel){
        imovelService.insertImovel(imovel);
    }
}
