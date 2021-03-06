package com.stefanini.teste;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.dao.PessoaDao;
import com.stefanini.dto.PessoaDto;
import com.stefanini.model.Endereco;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.parser.PessoaDtoParaPessoa;
import com.stefanini.parser.PessoaParaPessoaDto;
import com.stefanini.servico.EnderecoServico;
import com.stefanini.servico.PessoaServico;

public class App {

	@Inject
	private PessoaServico servico;
	
	@Inject
	private EnderecoServico enderecoServico;
	
	@Inject
	private PessoaParaPessoaDto toDTO;
	
	@Inject
	private PessoaDao dao;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
//		buscarTodos();
//		encontrar();
//		salvar();
//		remover();
//		testaDto(3L);
		System.out.println(dao.getListaPorNome("abacatão"));
	}
	
	
	private void remover() {
		servico.remover(5L);
	}

	private Optional<Pessoa> encontrar(Long id) {
		Optional<Pessoa> pessoa = servico.encontrar(id);
		if (pessoa.isPresent()) {
			//System.out.println("Pessoa encontrada");
			//System.out.println(pessoa.get());
			
		} else {
			System.out.println("Pessoa não encontrada");
		
		}
		return pessoa;
	}

	private void buscarTodos() {
		servico.getList().ifPresent(i -> {
			i.forEach(b -> {
				System.out.println(b);
			});
		});
//		System.out.println();
	}
	
	private void testaDto(Long id) {
		System.out.println("Conversão feita com sucesso!");
		System.out.println((toDTO.apply(encontrar(id))).getNome());
	}

	public void salvar() {

		Timestamp dataInclusao = new Timestamp(System.currentTimeMillis());
		Timestamp dataAlteracao = new Timestamp(System.currentTimeMillis() + 2);
		Perfil perfil1 = new Perfil("Aprovado", "Aprovado com sucesso nas matérias", dataInclusao,  dataAlteracao );
		Pessoa pessoa2 = new Pessoa("Abacatão", "abacate@gmail.com.brt6", LocalDate.of(1994, 3, 26), Boolean.TRUE);
		servico.salvar(pessoa2);
		Endereco endereco2 = new Endereco("ÁGUAS CLARAS", "Próximo a uma distribuidora", "Arniqueiras", "Brasília", "DF", "12345678", pessoa2);
		enderecoServico.salvar(endereco2);

	}

}
