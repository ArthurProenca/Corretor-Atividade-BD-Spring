package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Imovel;
import dev.friday.com.corretor.service.ImovelService;
import io.swagger.annotations.Api;
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

    @Transactional
    @PostMapping("/insert")
    public void insertImovel(@RequestBody Imovel imovel) {
        log.info("Inserting imovel: " + imovel.toString());
        imovelService.insertImovel(imovel);
    }

    @Transactional
    @PostMapping("/update")
    public void updateImovel(@RequestBody Imovel imovel) {
        log.info("Updating imovel: " + imovel.toString());
        imovelService.updateImovel(imovel);
    }

    @Transactional
    @PostMapping("/delete")
    public void deleteImovel(@RequestBody Integer id) {
        log.info("Deleting imovel: ");
        imovelService.deleteImovel(id);
    }
}
