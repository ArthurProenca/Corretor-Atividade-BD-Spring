package dev.friday.com.corretor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "corretor_locador")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CorretorLocador {
    @Id
    @Column(name = "cod_lcd", nullable = false)
    private Integer cod_lcd;

    @Column(name = "cod_crt", nullable = false)
    private Integer cod_crt;

    @Column(name = "comissao", nullable = false)
    private Double comissao;
}
