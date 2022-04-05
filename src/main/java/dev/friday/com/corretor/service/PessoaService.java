package dev.friday.com.corretor.service;

import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import dev.friday.com.corretor.entity.*;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class PessoaService {

    @Autowired
    EntityManager entityManager;
    @Autowired
    PessoaRepository pessoaRepository;

    @Transactional
    public void insertInto(Pessoa pessoa) {
        entityManager.createNativeQuery("INSERT INTO pessoa (p_nome, u_nome, m_inicial) VALUES (?1, ?2, ?3)")
                .setParameter(1, pessoa.getPNome())
                .setParameter(2, pessoa.getUNome())
                .setParameter(3, pessoa.getMInicial())
                .executeUpdate()
        ;
        //entityManager.persist(pessoa);
    }

    @Transactional
    public void alterPessoa(Integer id, String unome, String pnome, String minicial) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        String query = "";
        if (pessoa.isPresent()) {
            if (unome != null)
                pessoa.get().setUNome(unome);
            if (pnome != null)
                pessoa.get().setPNome(pnome);
            if (minicial != null)
                pessoa.get().setMInicial(minicial);

            query = String.format("UPDATE pessoa SET u_nome = %s, p_nome = %s, m_inicial = %s WHERE cod_pessoa = %d;", pessoa.get().getUNome(), pessoa.get().getPNome(), pessoa.get().getMInicial(), id);
        }
        entityManager.createNativeQuery(query)
                .executeUpdate()
        ;
    }

    @Transactional
    public void deletePessoa(Integer id) {
        String query = "DELETE FROM pessoa WHERE cod_pessoa = " + id;
        entityManager.createNativeQuery(query).executeUpdate();
    }

    @Transactional
    public List<Pessoa> searchPessoa(String unome, String pnome, String minicial) {

        String query = "SELECT p FROM Pessoa p WHERE u_nome LIKE '%" + unome + "%' OR p_nome LIKE '%" + pnome + "%' OR m_inicial LIKE '%" + minicial + "%'";
        return entityManager.createQuery(query, Pessoa.class).getResultList();

    }

    @Transactional
    public List<Pessoa> searchPessoaAninhada(String telefone) {

        String query = "SELECT p FROM Pessoa p WHERE p.cod_pessoa = (SELECT cod_pessoa FROM Telefone t WHERE t.telefone = '" + telefone + "')";
        return entityManager.createQuery(query, Pessoa.class).getResultList();

    }

    public Iterable<Pessoa> getAll(){
        return entityManager.createNativeQuery("SELECT ALL cod_pessoa FROM pessoa").getResultList();
    }

    public List<Pessoa> pessoaCorretora() {
        return entityManager.createNativeQuery("SELECT DISTINCT * FROM pessoa WHERE EXISTS (SELECT * FROM corretor WHERE corretor.cod_crt = pessoa.cod_pessoa);")
                .getResultList();
    }
    public List<Pessoa> pessoaNaoCorretora() {
        return entityManager.createNativeQuery("SELECT cod_pessoa, p_nome FROM pessoa WHERE cod_pessoa == ANY (SELECT cod_pessoa FROM corretor)")
                .getResultList();
    }

    public List<Pessoa> pessoaCorretoraOuLocadora(){
        return entityManager.createNativeQuery("SELECT * FROM pessoa WHERE cod_pessoa IN ((SELECT cod_crt FROM corretor) " +
                "UNION (SELECT cod_lcd FROM locador));", Pessoa.class)
                .getResultList();

    }


}
