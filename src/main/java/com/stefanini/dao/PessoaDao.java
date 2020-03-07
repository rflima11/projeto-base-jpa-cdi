package com.stefanini.dao;

import java.util.List;
import java.util.stream.Collectors;

import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Pessoa;

/**
 * O Unico objetivo da Dao 
 * @author joaopedromilhome
 *
 */
public class PessoaDao extends GenericDao<Pessoa, Long> {

	public PessoaDao() {
		super(Pessoa.class);
	}
	
	public List<Pessoa> getListaPorNome(String nome){
		List<Pessoa> lista = this.getList().get();
		return lista.stream().filter(pessoa -> pessoa.getNome().toLowerCase().equals(nome.toLowerCase())).collect(Collectors.toList());
		}
}