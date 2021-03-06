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
@Table(name = "locatario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Locatario {
    @Id
    @Column(name = "cod_lct", nullable = false)
    private int cod_lct;

    @Column(name = "data_nasc", nullable = false)
    private Date data_nasc;
}
