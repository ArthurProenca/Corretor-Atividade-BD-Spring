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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "corretor")
public class Corretor {
    @Id
    @Column(name = "cod_crt", nullable = false)
    private Integer cod_crt;

    @Column(name = "avaliacao", nullable = false)
    private Integer avaliacao;

}