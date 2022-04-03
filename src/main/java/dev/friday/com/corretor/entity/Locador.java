package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "locador")
public class Locador {

    @Id
    @Column(name = "cod_lcd")
    private int cod;

    @Column(name = "e_parceiro")
    private boolean eParceiro;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public boolean iseParceiro() {
        return eParceiro;
    }

    public void seteParceiro(boolean eParceiro) {
        this.eParceiro = eParceiro;
    }
}