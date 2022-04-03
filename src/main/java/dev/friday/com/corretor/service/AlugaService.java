package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Aluga;
import dev.friday.com.corretor.repository.AlugaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class AlugaService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    AlugaRepository alugaRepository;

    @Transactional
    public void insertAluga(Aluga aluga) {
        alugaRepository.save(aluga);
    }
}
