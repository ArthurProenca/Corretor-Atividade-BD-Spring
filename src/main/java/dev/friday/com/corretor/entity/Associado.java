package dev.friday.com.corretor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "associado")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Associado {
    @Id
    @Column(name = "cod_lcd", nullable = false)
    private Integer cod_lcd;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "data_nasc", nullable = false)
    private Date data_nasc;

    @Column(name = "tipo_associacao", nullable = false)
    private String tipo_associacao;
}
