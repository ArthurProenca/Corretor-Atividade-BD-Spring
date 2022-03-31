package dev.friday.com.corretor.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class TelefoneId implements Serializable {
    private Integer codPessoa;
    private String telefone;

    public TelefoneId(Integer codPessoa, String telefone) {
        this.codPessoa = codPessoa;
        this.telefone = telefone;
    }
}
