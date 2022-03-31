package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "corretor")
@PrimaryKeyJoinColumn(name = "cod_crt", referencedColumnName = "cod_pessoa")
public class Corretor extends Pessoa {

    @Column
    private Integer avaliacao;
}
