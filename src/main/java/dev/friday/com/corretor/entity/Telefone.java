package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "telefone")
@IdClass(TelefoneId.class)
public class Telefone {
    @Id
    @Column(name = "telefone", length = 11)
    private String telefone;

    @Id
    @JoinColumn(name = "cod_pessoa", nullable = false)
    private int codPessoa;

}