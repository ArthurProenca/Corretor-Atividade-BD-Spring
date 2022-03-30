package dev.friday.com.corretor.resource;

import dev.friday.com.corretor.service.CorretoraService;
import dev.friday.com.corretor.service.PessoaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/public/v1/corretor-resource")
@Api(tags = "Corretor API")
@CrossOrigin
@Log4j2
public class CorretoraResource {
    @Autowired
    private CorretoraService corretoraService;

    @PostMapping("/rename")
    @ApiOperation(value = "Rename a table")
    public void renameTable(@RequestParam String tableName, @RequestParam String newTableName){
        corretoraService.renameTable(tableName, newTableName);
    }
}
