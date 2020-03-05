package com.stefanini.parser;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.stefanini.dto.PessoaDto;
import com.stefanini.model.Pessoa;

public interface Conversor<A, B> extends Function<A, B> {
    default List<B> convertToList(final List<A> input) {
        return input.stream().map(this::apply).collect(Collectors.toList());
    }

	

	
}
