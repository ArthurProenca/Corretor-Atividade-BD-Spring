package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Locador;
import dev.friday.com.corretor.repository.LocadorRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class LocadorService {

    @Autowired
    private LocadorRepository locadorRepository;

    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertLocador(Locador locador) {
        entityManager.createNativeQuery("INSERT INTO locador (cod_lcd, e_parceiro) VALUES (?1, ?2)")
                .setParameter(1, locador.getCod_lcd())
                .setParameter(2, locador.getE_parceiro()).executeUpdate();
    }
}
