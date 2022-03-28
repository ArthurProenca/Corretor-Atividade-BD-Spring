package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Pessoa;
import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class CorretorService {

    PessoaRepository pessoaRepository;
    @Autowired
    private EntityManager entityManager;

    public Long getCount(){
        return pessoaRepository.count();
    }
    @Transactional
    public List<Pessoa> findAll(){
        Pessoa p = new Pessoa();
        p.setId(112312);
        p.setMInicial("asd");
        p.setPNome("123123");
        p.setUNome("12312312");
        entityManager.persist(p);
        entityManager.flush();
        return pessoaRepository.findAll();
    }
}
