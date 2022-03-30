package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.service.ImovelService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/imovel")
@Api(tags = "Imovel API")
@CrossOrigin
@Log4j2
public class ImovelResource {
    @Autowired
    private ImovelService imovelService;

    @PostMapping
    @ApiOperation(value = "Insert imovel on DB")
    @Transactional
    public void insertImovel(@RequestBody ){
        //imovelService.insertImovel();
    }
}
