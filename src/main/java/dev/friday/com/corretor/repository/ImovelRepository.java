package dev.friday.com.corretor.repository;

import dev.friday.com.corretor.entity.Imovel;
import dev.friday.com.corretor.entity.Locador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Locador> {
}
