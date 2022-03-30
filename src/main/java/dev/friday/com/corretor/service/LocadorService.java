package dev.friday.com.corretor.service;

import dev.friday.com.corretor.repository.ImovelRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class LocadorService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    ImovelRepository imovelRepository;


}
