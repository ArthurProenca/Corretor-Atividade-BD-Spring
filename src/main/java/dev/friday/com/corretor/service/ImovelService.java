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

    @Transactional
    public void updateImovel(Imovel imovel) {
        entityManager.createNativeQuery("UPDATE imovel SET cod_lcd = ?1, mensalidade = ?2, nQuartos = ?3, nBanheiros = ?4, dimensao = ?5, temSuite = ?6, rua = ?7, numero = ?8, bairro = ?9, num_apart = ?10, tem_garagem = ?11, tipo = ?12 WHERE cod_imv = ?13")
                .setParameter(1, imovel.getCod_lcd())
                .setParameter(2, imovel.getMensalidade())
                .setParameter(3, imovel.getNQuartos())
                .setParameter(4, imovel.getNBanheiros())
                .setParameter(5, imovel.getDimensao())
                .setParameter(6, imovel.getTemSuite())
                .setParameter(7, imovel.getRua())
                .setParameter(8, imovel.getNumero())
                .setParameter(9, imovel.getBairro())
                .setParameter(10, imovel.getNum_apart())
                .setParameter(11, imovel.getTem_garagem())
                .setParameter(12, imovel.getTipo())
                .setParameter(13, imovel.getCod_imv())
                .executeUpdate();
    }

    @Transactional
    public void deleteImovel(int cod_imv) {
        entityManager.createNativeQuery("DELETE FROM imovel WHERE cod_imv = ?1")
                .setParameter(1, cod_imv)
                .executeUpdate();
    }

}
