package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.Locador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocadorRepository extends JpaRepository<Locador, Integer> {
}
