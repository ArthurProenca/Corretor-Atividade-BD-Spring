package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "locador")
@PrimaryKeyJoinColumn(name = "cod_lcd", referencedColumnName = "cod_pessoa")
public class Locador extends Pessoa {


    @Column(name = "e_parceiro")
    private boolean eParceiro;

}