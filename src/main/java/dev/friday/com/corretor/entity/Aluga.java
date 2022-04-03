package dev.friday.com.corretor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "aluga")
public class Aluga {
    @Id
    @Column(name = "cod_imv", nullable = false)
    private int cod_imv;

    @Column(name = "cod_crt", nullable = false)
    private int cod_crt;

    @Column(name = "cod_lct", nullable = false)
    private int cod_lct;

    @Column(name = "data_inicio_alug", nullable = false)
    private Date data_inicio_alug;

    @Column(name = "data_fim_alug", nullable = false)
    private Date data_fim_alug;
}
