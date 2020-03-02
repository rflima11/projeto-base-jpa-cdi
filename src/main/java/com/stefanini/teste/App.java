package com.stefanini.teste;

import java.time.LocalDate;
import java.util.Optional;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;
import javax.inject.Inject;

import com.stefanini.model.Endereco;
import com.stefanini.model.Pessoa;
import com.stefanini.servico.EnderecoServico;
import com.stefanini.servico.PessoaServico;

public class App {

	@Inject
	private PessoaServico servico;
	
	@Inject
	private EnderecoServico servicoEndereco;

	public static void main(String[] args) {
		// CONFIGURACAO PARA INICIAR O CONTAINER PARA GERENCIAMENTO DO CDI
		SeContainerInitializer initializer = SeContainerInitializer.newInstance();
		try (final SeContainer container = initializer.initialize()) {
			App app = container.select(App.class).get();
			app.executar();
		}
	}

	public void executar() {
		salvar();
//		encontrar();
//		salvar();
//		remover();
	}
	
	
	private void remover() {
		servico.remover(5L);
	}

	private void encontrar() {
		Optional<Pessoa> pessoa = servico.encontrar(5L);
		if (pessoa.isPresent()) {
			System.out.println("Pessoa encontrada");
			System.out.println(pessoa.get());
		} else {
			System.out.println("Pessoa não encontrada");
		}
	}

	private void buscarTodos() {
		servico.getList().ifPresent(i -> {
			i.forEach(b -> {
				System.out.println(b);
			});
		});
//		System.out.println();
	}

	public void salvar() {

		//Pessoa pessoa = new Pessoa("JOAO", "joaom.dev@hotmail.com.br22", LocalDate.of(1995, 8, 24), Boolean.FALSE);
		Pessoa pessoa2 = new Pessoa("Abacatão", "abacate@gmail.com.brt86", LocalDate.of(1994, 3, 26), Boolean.TRUE);
		//servico.salvar(pessoa);
		servico.salvar(pessoa2);
		Endereco endereco2 = new Endereco("ÁGUAS CLARAS", "Próximo a uma distribuidora", "Arniqueiras", "Brasília", "DF", "12345678", pessoa2);
	//	Endereco endereco1 = new Endereco("QNL 10 BLOCO G", "Próximo ao mercado", "Taguatinga Norte", "Brasília", "DF", "12345678", pessoa);
		servicoEndereco.salvar(endereco2);
	}

}
