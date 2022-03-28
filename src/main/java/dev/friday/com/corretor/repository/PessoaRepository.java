package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
