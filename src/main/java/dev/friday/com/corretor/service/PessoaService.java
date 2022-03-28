package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Pessoa;
import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.NamedNativeQuery;
import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PessoaService {

    PessoaRepository pessoaRepository;
    @Autowired
    EntityManager entityManager;

    public Long getCount() {
        return pessoaRepository.count();
    }


    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    @Transactional
    public void insertInto(Pessoa pessoa) {
        String query = "INSERT INTO pessoa (p_nome, u_nome, m_inicial) VALUES (p_nome = :p_nome, u_nome = :u_nome, m_inicial = :m_inicial)";
        System.out.println(pessoa.getMInicial());
        entityManager.createNativeQuery(query)
                .setParameter("p_nome", pessoa.getPNome())
                .setParameter("u_nome", pessoa.getUNome())
                .setParameter("m_inicial", pessoa.getMInicial())
                ;
        entityManager.persist(pessoa);
    }
}
