package dev.friday.com.corretor.service;

import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import dev.friday.com.corretor.entity.*;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PessoaService {

    @Autowired
    EntityManager entityManager;
    @Autowired
    PessoaRepository pessoaRepository;

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

    @Transactional
    public void alterPessoa(Integer id, String unome, String pnome, String minicial) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        String query = "";
        if (pessoa.isPresent()) {
            if (unome != null)
                pessoa.get().setUNome(unome);
            if (pnome != null)
                pessoa.get().setPNome(pnome);
            if (minicial != null)
                pessoa.get().setMInicial(minicial);

            query = String.format("UPDATE pessoa SET u_nome = %s, p_nome = %s, m_inicial = %s WHERE cod_pessoa = %d;", pessoa.get().getUNome(), pessoa.get().getPNome(), pessoa.get().getMInicial(), id);
        }
        entityManager.createNativeQuery(query)
                .executeUpdate()
        ;
    }

    @Transactional
    public void deletePessoa(Integer id){
        String query = "DELETE FROM pessoa WHERE cod_pessoa = " + id;
        entityManager.createNativeQuery(query).executeUpdate();
    }
}
