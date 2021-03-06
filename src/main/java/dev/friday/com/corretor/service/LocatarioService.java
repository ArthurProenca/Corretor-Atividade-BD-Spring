package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Locatario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class LocatarioService {
    @Autowired
    EntityManager entityManager;


    @Transactional
    public void insertLocatario(Locatario locatario) {
        entityManager.createNativeQuery("INSERT INTO locatario (cod_lct, data_nasc) VALUES (?1, ?2)")
                .setParameter(1, locatario.getCod_lct())
                .setParameter(2, locatario.getData_nasc())
                .executeUpdate();
    }

    @Transactional
    public void updateLocatario(Locatario locatario) {
        entityManager.createNativeQuery("UPDATE locatario SET cod_lct = ?1, data_nasc = ?2 WHERE cod_lct = ?3")
                .setParameter(1, locatario.getCod_lct())
                .setParameter(2, locatario.getData_nasc())
                .setParameter(3, locatario.getCod_lct())
                .executeUpdate();
    }

    @Transactional
    public void deleteLocatario(Integer id) {
        entityManager.createNativeQuery("DELETE FROM locatario WHERE cod_lct = ?1")
                .setParameter(1, id)
                .executeUpdate();
    }
}
