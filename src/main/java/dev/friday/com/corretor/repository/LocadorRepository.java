package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.Locador;
import dev.friday.com.corretor.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocadorRepository extends JpaRepository<Locador, Pessoa> {
}
