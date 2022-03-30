package dev.friday.com.corretor.service;

import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CorretoraService {

    @Autowired
    EntityManager entityManager;
    @Autowired
    PessoaRepository pessoaRepository;

    @Transactional
    public void renameTable(String table, String newTableName){
        String query = "RENAME TABLE " + table + " TO " + newTableName;
        entityManager.createNativeQuery(query)
                .executeUpdate();
    }
}
