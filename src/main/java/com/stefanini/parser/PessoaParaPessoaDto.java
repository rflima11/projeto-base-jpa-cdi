package com.stefanini.parser;

import java.util.Optional;

import com.stefanini.dto.PessoaDto;
import com.stefanini.model.Pessoa;

public class PessoaParaPessoaDto implements Conversor<Optional<Pessoa>, PessoaDto> {
    @Override
    public PessoaDto apply (Optional<Pessoa> input) {
        final PessoaDto person = new PessoaDto();
        person.setNome(input.get().getNome());
        person.setId(input.get().getId());
        person.setDataNascimento(input.get().getDataNascimento());
        person.setEmail(input.get().getEmail());
        person.setSituacao(input.get().getSituacao());
        return person;
    }

	

	
}