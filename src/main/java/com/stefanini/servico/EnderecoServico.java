package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.EnderecoDao;
import com.stefanini.model.Endereco;
import com.stefanini.util.IGenericService;

public class EnderecoServico implements IGenericService<Endereco, Long> {

	@Inject
	private EnderecoDao enderecoDao;
	
	@Override
	public Endereco salvar(@Valid Endereco entity) {
		return enderecoDao.salvar(entity);
	}

	@Override
	public Endereco atualizar(@Valid Endereco entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<List<Endereco>> getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Endereco> encontrar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
