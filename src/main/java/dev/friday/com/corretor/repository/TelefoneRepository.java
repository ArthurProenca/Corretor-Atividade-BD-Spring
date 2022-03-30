package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Integer> {
}
