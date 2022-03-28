package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_pessoa", nullable = false)
    private Integer cod_pessoa;

    @Column(name = "p_nome", nullable = false, length = 40)
    private String pNome;

    @Column(name = "m_inicial", nullable = false, length = 40)
    private String mInicial;

    @Column(name = "u_nome", nullable = false, length = 40)
    private String uNome;

    public String getUNome() {
        return uNome;
    }

    public void setUNome(String uNome) {
        this.uNome = uNome;
    }

    public String getMInicial() {
        return mInicial;
    }

    public void setMInicial(String mInicial) {
        this.mInicial = mInicial;
    }

    public String getPNome() {
        return pNome;
    }

    public void setPNome(String pNome) {
        this.pNome = pNome;
    }

    public Integer getId() {
        return cod_pessoa;
    }

    public void setId(Integer id) {
        this.cod_pessoa = id;
    }
}