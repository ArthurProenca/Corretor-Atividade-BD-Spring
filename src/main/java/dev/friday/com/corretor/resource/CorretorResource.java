package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.entity.Pessoa;
import dev.friday.com.corretor.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/public/v1/corretor-resource/pessoa")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class CorretorResource {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping("/count")
    @ApiOperation(value = "Test", response = String.class)
    public ResponseEntity<Long> getCount(@RequestParam Long id){
        return ResponseEntity.ok(pessoaService.getCount());
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "Test", response = String.class)
    public List<Pessoa> findAll(@RequestParam Long id){
        return (pessoaService.findAll());
    }

    @PostMapping("/insert")
    @ApiOperation(value = "Insert Pessoa into DB")
    @Transactional
    public void insertPessoa(@RequestBody Pessoa pessoa){
        System.out.println(pessoa.getUNome());
        pessoaService.insertInto(pessoa);
    }

}
