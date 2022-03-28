package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Locador> {
}
