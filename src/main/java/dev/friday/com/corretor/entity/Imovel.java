package dev.friday.com.corretor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "imovel")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Imovel {
    @Id
    @Column(name = "cod_imv", nullable = false)
    private Integer cod_imv;

    @Column(name = "cod_lcd", nullable = false)
    private Integer cod_lcd;

    @Column(name = "mensalidade", nullable = false)
    private Double mensalidade;

    @Column(name = "nQuartos", nullable = false)
    private Integer nQuartos;

    @Column(name = "nBanheiros", nullable = false)
    private Integer nBanheiros;

    @Column(name = "dimensao", nullable = false)
    private Integer dimensao;

    @Column(name = "temSuite", nullable = false)
    private Boolean temSuite;

    @Column(name = "rua", nullable = false)
    private String rua;

    @Column(name = "numero", nullable = false)
    private Integer numero;

    @Column(name = "bairro", nullable = false)
    private String bairro;

    @Column(name = "num_apart", nullable = false)
    private Integer num_apart;

    @Column(name = "tem_garagem", nullable = false)
    private Boolean tem_garagem;

    @Column(name = "tipo" , nullable = false)
    private String tipo;
}
