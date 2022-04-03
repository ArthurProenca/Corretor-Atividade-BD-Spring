package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Aluga;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AlugaService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertAluga(Aluga aluga) {
        entityManager.createNativeQuery("INSERT INTO aluga (cod_crt, cod_lct, cod_imv, data_inicio_alug, data_fim_alug) VALUES (?1, ?2, ?3, ?4, ?5)")
                .setParameter(1, aluga.getCod_crt())
                .setParameter(2, aluga.getCod_lct())
                .setParameter(3, aluga.getCod_imv())
                .setParameter(4, aluga.getData_inicio_alug())
                .setParameter(5, aluga.getData_fim_alug())
                .executeUpdate();
    }
}
