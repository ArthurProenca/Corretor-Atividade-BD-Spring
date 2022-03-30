package dev.friday.com.corretor.service;

import dev.friday.com.corretor.entity.Telefone;
import dev.friday.com.corretor.repository.TelefoneRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    TelefoneRepository telefoneRepository;

    @Transactional
    public void inserTelefone(Telefone telefone) {
        entityManager.persist(telefone);
        entityManager.flush();
    }

    @Transactional
    public void updateTelefone(Integer cod_pessoa, String telefone) {
        Optional<Telefone> aux = telefoneRepository.findById(cod_pessoa);
        String query = "";

        if(aux.isPresent()){
            aux.get().setTelefone(telefone);
        }
        query = String.format("UPDATE telefone SET telefone = %s WHERE cod_pessoa = %d;", aux.get().getTelefone(), aux.get().getCodPessoa());
        entityManager.createNativeQuery(query)
                .executeUpdate();
    }

    @Transactional
    public void deleteTelefone(Integer id) {
        String query = "DELETE FROM telefone WHERE cod_pessoa = " + id;
        entityManager.createNativeQuery(query).executeUpdate();
    }

    @Transactional
    public String searchTelefone(String telefone, Integer cod_pessoa) {
        Telefone aux = new Telefone();
        String query = "";
        if (telefone != null) {
            aux.setTelefone(telefone);
            query = String.format("SELECT FROM telefone WHERE telefone like %s", aux.getTelefone());
        }

        return String.valueOf(entityManager.createNativeQuery(query).executeUpdate());
    }
}
