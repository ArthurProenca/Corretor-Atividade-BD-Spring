package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Corretor;
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

    @Transactional
    public void insertCorretor(Corretor corretor) {
        entityManager.createNativeQuery("INSERT INTO corretor (cod_crt, avaliacao) VALUES (?1, ?2)")
                .setParameter(1, corretor.getCod_crt())
                .setParameter(2, corretor.getAvaliacao())
                .executeUpdate();
    }

    @Transactional
    public void updateCorretor(Corretor corretor) {
        entityManager.createNativeQuery("UPDATE corretor SET avaliacao = ?1 WHERE cod_crt = ?2")
                .setParameter(1, corretor.getAvaliacao())
                .setParameter(2, corretor.getCod_crt())
                .executeUpdate();
    }

    @Transactional
    public void deleteCorretor(Integer id){
        entityManager.createNativeQuery("DELETE FROM corretor WHERE cod_crt = ?1")
                .setParameter(1, id)
                .executeUpdate();
    }
}
