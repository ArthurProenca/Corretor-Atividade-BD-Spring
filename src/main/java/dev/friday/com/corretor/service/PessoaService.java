package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Pessoa;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PessoaService {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public void insertInto(Pessoa pessoa) {
        String query = "INSERT INTO pessoa (p_nome, u_nome, m_inicial) VALUES (p_nome = :p_nome, u_nome = :u_nome, m_inicial = :m_inicial)";
        entityManager.createNativeQuery(query)
                .setParameter("p_nome", pessoa.getPNome())
                .setParameter("u_nome", pessoa.getUNome())
                .setParameter("m_inicial", pessoa.getMInicial())
                ;
        entityManager.persist(pessoa);
    }
}
