package dev.friday.com.corretor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regras_condominio")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegrasCondominio {
    @Id
    @Column(name = "cod_imv", nullable = false)
    private Integer cod_imv;

    @Column(name = "regra", nullable = false)
    private String regra;
}
