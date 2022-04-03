package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Associado;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AssociadoService {
    @Autowired
    EntityManager entityManager;

    @Transactional
    public void insertAssociado(Associado associado) {
        entityManager.createNativeQuery("INSERT INTO associado (nome, data_nasc, tipo_associacao, cod_lcd) VALUES (?1, ?2, ?3, ?4)")
                .setParameter(1, associado.getNome())
                .setParameter(2, associado.getData_nasc())
                .setParameter(3, associado.getTipo_associacao())
                .setParameter(4, associado.getCod_lcd())
                .executeUpdate();
    }
}
