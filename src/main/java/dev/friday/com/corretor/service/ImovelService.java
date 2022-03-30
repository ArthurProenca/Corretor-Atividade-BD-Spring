package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Imovel;
import dev.friday.com.corretor.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class ImovelService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    ImovelRepository imovelRepository;

    @Transactional
    public void insertImovel(Imovel imovel) {
        String query = "INSERT INTO imovel () VALUES ()";
        entityManager.persist(imovel);
    }
}
