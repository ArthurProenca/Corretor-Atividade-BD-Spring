package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Corretor;
import dev.friday.com.corretor.entity.Pessoa;
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
public class CorretorService {
    @Autowired
    EntityManager entityManager;

    public Iterable<Corretor> getAll(){
        return entityManager.createQuery("SELECT c FROM Corretor c", Corretor.class).getResultList();
    }

    @Transactional
    public void insertInto(Corretor corretor) {
//        entityManager.createNativeQuery("INSERT INTO pessoa (p_nome, u_nome, m_inicial) VALUES (?1, ?2, ?3)")
//                .setParameter(1, corretor.getMInicial())
//                .setParameter(2, corretor.getUNome())
//                .setParameter(3, corretor.getMInicial())
//                .executeUpdate()
//        ;
//
//        entityManager.createNativeQuery("INSERT INTO corretor VALUES (?1, ?2)")
//                .setParameter(1, corretor.getCod_pessoa)
//                .setParameter(2, corretor.getAvaliacao())
//                .executeUpdate()
//        ;
        entityManager.persist(corretor);
    }

}
