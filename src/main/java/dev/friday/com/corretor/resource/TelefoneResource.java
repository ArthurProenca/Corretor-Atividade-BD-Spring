package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Telefone;
import dev.friday.com.corretor.service.TelefoneService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
    private TelefoneService telefoneService;

    @PostMapping("/insert")
    @Transactional
    public void insertTelefone(@RequestBody Telefone telefone){
        telefoneService.inserTelefone(telefone);
    }

    @Transactional
    @PostMapping("/update")
    public void updateTelefone(@RequestParam Integer cod_pessoa, @RequestParam (required = false) String telefone){
        telefoneService.updateTelefone(cod_pessoa, telefone);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "Delete a row of Pessoa by ID")
    @Transactional
    public void deleteTelefone(@RequestParam Integer id){
        telefoneService.deleteTelefone(id);
    }

    @PostMapping("/search")
    @ApiOperation(value = "Search in table telefone any parameter or String")
    @Transactional
    public String searchPessoa(@RequestParam(required = false) String telefone, @RequestParam(required = false) Integer cod_pessoa) {
        return telefoneService.searchTelefone(telefone, cod_pessoa);
    }
}
