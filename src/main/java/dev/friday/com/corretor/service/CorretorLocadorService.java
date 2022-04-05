package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.CorretorLocador;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

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

    @Transactional
    public void updateCorretorLocador(CorretorLocador corretorLocador) {
        entityManager.createNativeQuery("update corretor_locador set cod_crt = ?1, comissao = ?2 where cod_lcd = ?3")
                .setParameter(1, corretorLocador.getCod_crt())
                .setParameter(2, corretorLocador.getComissao())
                .setParameter(3, corretorLocador.getCod_lcd())
                .executeUpdate();
    }

    @Transactional
    public void deleteCorretorLocador(Integer id) {
        entityManager.createNativeQuery("delete from corretor_locador where cod_lcd = ?1")
                .setParameter(1, id)
                .executeUpdate();
    }

    public List<CorretorLocador> getCorretorComissao() {

        return entityManager.createNativeQuery("SELECT * FROM corretor NATURAL JOIN corretor_locador WHERE comissao <= 300 AND avaliacao >= 4" +
                ";", CorretorLocador.class).getResultList();
    }
}
