package com.stefanini.parser;

import java.util.Optional;

import com.stefanini.dto.PessoaDto;
import com.stefanini.model.Pessoa;

public class PessoaDtoParaPessoa implements Conversor<Optional<PessoaDto>, Pessoa> {
    @Override
    public Pessoa apply (Optional<PessoaDto> input) {
        final Pessoa person = new Pessoa();
        person.setNome(input.get().getNome());
        person.setId(input.get().getId());
        person.setDataNascimento(input.get().getDataNascimento());
        person.setEmail(input.get().getEmail());
        person.setSituacao(input.get().getSituacao());
        return person;
    }

	

	
}


