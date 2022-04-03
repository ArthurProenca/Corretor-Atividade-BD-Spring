package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Telefone;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class TelefoneService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertTelefone(Telefone telefone) {
        entityManager.createNativeQuery("INSERT INTO telefone (cod_pessoa, telefone) VALUES (?1, ?2)")
                .setParameter(1, telefone.getCod_pessoa())
                .setParameter(2, telefone.getTelefone())
                .executeUpdate();
    }
}
