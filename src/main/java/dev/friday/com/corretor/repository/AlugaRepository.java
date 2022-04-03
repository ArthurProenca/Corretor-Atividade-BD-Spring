package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.Aluga;
import dev.friday.com.corretor.entity.AlugaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlugaRepository extends JpaRepository<Aluga, AlugaId> {
}
