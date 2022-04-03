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

    @Transactional
    public void updateRegras(RegrasCondominio regrasCondominio) {
        entityManager.createNativeQuery("UPDATE regras_condominio SET regra = ?1 WHERE cod_imv = ?2")
                .setParameter(1, regrasCondominio.getRegra())
                .setParameter(2, regrasCondominio.getCod_imv())
                .executeUpdate();
    }

    @Transactional
    public void deleteRegras(Integer id) {
        entityManager.createNativeQuery("DELETE FROM regras_condominio WHERE cod_imv = ?1")
                .setParameter(1, id)
                .executeUpdate();
    }
}
