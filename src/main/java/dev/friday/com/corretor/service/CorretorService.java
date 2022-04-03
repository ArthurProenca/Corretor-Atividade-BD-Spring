package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Corretor;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CorretorService {

    @Autowired
    EntityManager entityManager;

    public void insertCorretor(Corretor corretor) {
        entityManager.createNativeQuery("INSERT INTO corretor (cod_crt, avaliacao) VALUES (?1, ?2)")
                .setParameter(1, corretor.getCod_crt())
                .setParameter(2, corretor.getAvaliacao())
                .executeUpdate();
    }
}
