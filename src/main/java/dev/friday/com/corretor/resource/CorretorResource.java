package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import dev.friday.com.corretor.entity.*;
import javax.transaction.Transactional;

@RestController
@RequestMapping("/public/v1/corretor-resource/pessoa")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class CorretorResource {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/insert")
    @ApiOperation(value = "Insert Pessoa into DB")
    @Transactional
    public void insertPessoa(@RequestBody Pessoa pessoa){
        pessoaService.insertInto(pessoa);
    }

    @PostMapping("/update")
    @ApiOperation(value = "Alters Pessoa into DB")
    @Transactional
    public void alterPessoa(@RequestParam Integer id, @RequestParam(required = false) String unome, @RequestParam (required = false) String pnome, @RequestParam (required = false) String minicial ){
        pessoaService.alterPessoa(id, unome, pnome, minicial);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "Delete a row of Pessoa by ID")
    public void deletePessoa(@RequestParam Integer id){
        pessoaService.deletePessoa(id);
    }

}
