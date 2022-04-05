package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import dev.friday.com.corretor.entity.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/public/v1/corretor-resource/pessoa")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class PessoaResource {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping("/insert")
    @ApiOperation(value = "Insert Pessoa into DB")
    @Transactional
    public void insertPessoa(@RequestBody Pessoa pessoa) {
        pessoaService.insertInto(pessoa);
    }

    @PostMapping("/update")
    @ApiOperation(value = "Alters Pessoa into DB")
    @Transactional
    public void alterPessoa(@RequestParam Integer id, @RequestParam(required = false) String unome, @RequestParam(required = false) String pnome, @RequestParam(required = false) String minicial) {
        pessoaService.alterPessoa(id, unome, pnome, minicial);
    }

    @PostMapping("/delete")
    @ApiOperation(value = "Delete a row of Pessoa by ID")
    @Transactional
    public void deletePessoa(@RequestParam Integer id) {
        pessoaService.deletePessoa(id);
    }

    @PostMapping("/search")
    @ApiOperation(value = "Search in table pessoa any parameter or String")
    @Transactional
    public List<Pessoa> searchPessoa(@RequestParam(required = false) String unome, @RequestParam(required = false) String pnome, @RequestParam(required = false) String minicial) {
        return pessoaService.searchPessoa(unome, pnome, minicial);
    }

    @GetMapping("/all")
    @ApiOperation(value = "Get in table pessoa all tuples")
    public Iterable<Pessoa> getAllPessoa(){
        return pessoaService.getAll();
    }

    @PostMapping("/pessoa/telefone")
    @Transactional
    public List<Pessoa> getPessoaByTelefone(@RequestParam String telefone){
        return pessoaService.searchPessoaAninhada(telefone);
    }

    @GetMapping("/pessoa/corretora")
    public List<Pessoa> getPessoaCorretora(){
        return pessoaService.pessoaCorretora();
    }

    @GetMapping("/pessoa/nao/corretora")
    public List<Pessoa> getPessoaNaoCorretora(){
        return pessoaService.pessoaNaoCorretora();
    }
}


