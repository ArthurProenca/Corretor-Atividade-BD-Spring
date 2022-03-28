package dev.friday.com.corretor.service;

import dev.friday.com.corretor.repository.PessoaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CorretorService {

    PessoaRepository pessoaRepository;

    public Long getCount(){
        return pessoaRepository.count();
    }
}
