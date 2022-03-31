package dev.friday.com.corretor.service;

import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import dev.friday.com.corretor.entity.*;

import java.util.List;
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
        entityManager.createNativeQuery("INSERT INTO pessoa (p_nome, u_nome, m_inicial) VALUES (?1, ?2, ?3)")
                .setParameter(1, pessoa.getMInicial())
                .setParameter(2, pessoa.getUNome())
                .setParameter(3, pessoa.getMInicial())
                .executeUpdate()
        ;
        //entityManager.persist(pessoa);
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
    public void deletePessoa(Integer id) {
        String query = "DELETE FROM pessoa WHERE cod_pessoa = " + id;
        entityManager.createNativeQuery(query).executeUpdate();
    }

    @Transactional
    public String searchPessoa(String unome, String pnome, String minicial) {
        Pessoa pessoa = new Pessoa();
        String query = "";
        if (unome != null) {
            pessoa.setUNome(unome);
            query = String.format("SELECT FROM pessoa WHERE u_nome like %s", pessoa.getUNome());
        }
        if (pnome != null) {
            pessoa.setPNome(pnome);
            query = String.format("SELECT FROM pessoa WHERE p_nome like %s", pessoa.getPNome());
        }
        if (minicial != null) {
            pessoa.setMInicial(minicial);
            query = String.format("SELECT FROM pessoa WHERE m_inicial like %s", pessoa.getMInicial());
        }
        return String.valueOf(entityManager.createNativeQuery(query).executeUpdate());

    }

    public Iterable<Pessoa> getAll(){
        return entityManager.createQuery("SELECT p FROM Pessoa p", Pessoa.class).getResultList();
    }

}
