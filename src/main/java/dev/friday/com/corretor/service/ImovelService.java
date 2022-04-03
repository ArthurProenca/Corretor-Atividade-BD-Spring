package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Imovel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ImovelService {
    @Autowired
    private EntityManager entityManager;

    @Transactional
    public void insertImovel(Imovel imovel) {
        entityManager.createNativeQuery("INSERT INTO imovel (cod_imv, cod_lcd, mensalidade, nQuartos, nBanheiros, dimensao, temSuite, rua, numero, bairro, num_apart, tem_garagem, tipo) " +
                "VALUES (?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8, ?9, ?10, ?11, ?12, ?13)")
                .setParameter(1, imovel.getCod_imv())
                .setParameter(2, imovel.getCod_lcd())
                .setParameter(3, imovel.getMensalidade())
                .setParameter(4, imovel.getNQuartos())
                .setParameter(5, imovel.getNBanheiros())
                .setParameter(6, imovel.getDimensao())
                .setParameter(7, imovel.getTemSuite())
                .setParameter(8, imovel.getRua())
                .setParameter(9, imovel.getNumero())
                .setParameter(10, imovel.getBairro())
                .setParameter(11, imovel.getNum_apart())
                .setParameter(12, imovel.getTem_garagem())
                .setParameter(13, imovel.getTipo())
                .executeUpdate();
    }

}
