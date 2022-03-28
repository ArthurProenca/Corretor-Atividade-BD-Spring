package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityManager;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
