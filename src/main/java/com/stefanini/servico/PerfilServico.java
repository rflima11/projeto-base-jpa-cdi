package com.stefanini.servico;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import com.stefanini.dao.PerfilDao;
import com.stefanini.model.Perfil;
import com.stefanini.util.IGenericService;

public class PerfilServico implements IGenericService<Perfil, Long> {
	
	@Inject
	private PerfilDao perfilDao;

	@Override
	public Perfil salvar(@Valid Perfil entity) {
		return perfilDao.salvar(entity);
	}

	@Override
	public Perfil atualizar(@Valid Perfil entity) {
		perfilDao.atualizar(entity);
		return null;
	}

	@Override
	public void remover(Long id) {
		perfilDao.remover(id);
		
	}

	@Override
	public Optional<List<Perfil>> getList() {
		
		return perfilDao.getList();
	}

	@Override
	public Optional<Perfil> encontrar(Long id) {
		return perfilDao.encontrar(id);
	}

}
