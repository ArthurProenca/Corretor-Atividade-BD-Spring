package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.CorretorLocador;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CorretorLocadorService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertCorretorLocador(CorretorLocador corretorLocador) {
        entityManager.createNativeQuery("insert into corretor_locador (cod_lcd, cod_crt, comissao) values (?1, ?2, ?3)")
                .setParameter(1, corretorLocador.getCod_lcd())
                .setParameter(2, corretorLocador.getCod_crt())
                .setParameter(3, corretorLocador.getComissao())
                .executeUpdate();
    }
}
