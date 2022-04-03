package dev.friday.com.corretor.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pessoa")
public class Locador {

    @Id
    @Column(name = "cod_lcd", nullable = false)
    private int cod_lcd;

    @Column(name = "e_parceiro", nullable = false)
    private Boolean e_parceiro;

    public int getCod_lcd() {
        return cod_lcd;
    }

    public void setCod_lcd(int cod_lcd) {
        this.cod_lcd = cod_lcd;
    }

    public Boolean getE_parceiro() {
        return e_parceiro;
    }

    public void setE_parceiro(Boolean e_parceiro) {
        this.e_parceiro = e_parceiro;
    }
}
