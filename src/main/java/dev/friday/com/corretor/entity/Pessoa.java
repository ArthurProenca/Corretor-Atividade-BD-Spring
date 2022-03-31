package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pessoa", nullable = false)
    private int cod_pessoa;

    @Column(name = "p_nome", nullable = false, length = 40)
    private String pNome;

    @Column(name = "m_inicial", nullable = false, length = 40)
    private String mInicial;

    @Column(name = "u_nome", nullable = false, length = 40)
    private String uNome;

    public Pessoa(Integer cod_pessoa, String pNome, String mInicial, String uNome) {
        this.cod_pessoa = cod_pessoa;
        this.pNome = pNome;
        this.mInicial = mInicial;
        this.uNome = uNome;
    }

    public Pessoa(){};

    @Override
    public String toString() {
        return "Pessoa{" +
                "cod_pessoa=" + cod_pessoa +
                ", pNome='" + pNome + '\'' +
                ", mInicial='" + mInicial + '\'' +
                ", uNome='" + uNome + '\'' +
                '}';
    }
}