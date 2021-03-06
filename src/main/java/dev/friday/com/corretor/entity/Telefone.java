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
@Table(name = "telefone")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Telefone {
    @Id
    @Column(name = "cod_pessoa", nullable = false)
    private Integer cod_pessoa;

    @Column(name = "telefone", nullable = false)
    private String telefone;
}
