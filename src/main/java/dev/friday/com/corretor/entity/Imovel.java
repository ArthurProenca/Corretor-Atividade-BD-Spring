package dev.friday.com.corretor.entity;

import javax.persistence.*;

@Entity
@Table(name = "imovel")
public class Imovel {
    @Id
    @Column(name = "cod_imv", nullable = false)
    private Integer id;

    @Basic(fetch = FetchType.LAZY)
    @Column(name = "cod_lcd", nullable = false)
    private Integer codLcd;

    @Column(name = "mensalidade", nullable = false)
    private Double mensalidade;

    @Column(name = "nQuartos", nullable = false)
    private Integer nQuartos;

    @Column(name = "nBanheiros", nullable = false)
    private Integer nBanheiros;

    @Column(name = "dimensao", nullable = false)
    private Integer dimensao;

    @Column(name = "temSuite", nullable = false)
    private Boolean temSuite = false;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "bairro", nullable = false, length = 30)
    private String bairro;

    @Column(name = "num_apart", nullable = false)
    private Integer numApart;

    @Column(name = "tem_garagem", nullable = false)
    private Boolean temGaragem = false;

    @Column(name = "tipo", nullable = false, length = 15)
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getTemGaragem() {
        return temGaragem;
    }

    public void setTemGaragem(Boolean temGaragem) {
        this.temGaragem = temGaragem;
    }

    public Integer getNumApart() {
        return numApart;
    }

    public void setNumApart(Integer numApart) {
        this.numApart = numApart;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Boolean getTemSuite() {
        return temSuite;
    }

    public void setTemSuite(Boolean temSuite) {
        this.temSuite = temSuite;
    }

    public Integer getDimensao() {
        return dimensao;
    }

    public void setDimensao(Integer dimensao) {
        this.dimensao = dimensao;
    }

    public Integer getNBanheiros() {
        return nBanheiros;
    }

    public void setNBanheiros(Integer nBanheiros) {
        this.nBanheiros = nBanheiros;
    }

    public Integer getNQuartos() {
        return nQuartos;
    }

    public void setNQuartos(Integer nQuartos) {
        this.nQuartos = nQuartos;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(Double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Integer getCodLcd() {
        return codLcd;
    }

    public void setCodLcd(Integer codLcd) {
        this.codLcd = codLcd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}