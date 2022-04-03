package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.RegrasCondominio;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class RegrasService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertRegras(RegrasCondominio regrasCondominio) {
        entityManager.createNativeQuery("INSERT INTO regras_condominio (cod_imv, regra) VALUES (?1, ?2)")
                .setParameter(1, regrasCondominio.getCod_imv())
                .setParameter(2, regrasCondominio.getRegra())
                .executeUpdate();
    }
}
