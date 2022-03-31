package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "locatario")
@PrimaryKeyJoinColumn(name = "cod_lct", referencedColumnName = "cod_pessoa")
public class Locatario extends Pessoa{

    @Column(name = "data_nasc", nullable = false)
    private LocalDate dataNasc;

}