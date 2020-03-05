package com.stefanini.dto;

import java.sql.Timestamp;

public class PerfilDto {
	
	private long id;
	private String perfil;
	private String descricaoPerfil;
	private Timestamp horaInclusao;
	private Timestamp horaAlteracao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPerfil() {
		return perfil;
	}
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	public String getDescricaoPerfil() {
		return descricaoPerfil;
	}
	public void setDescricaoPerfil(String descricaoPerfil) {
		this.descricaoPerfil = descricaoPerfil;
	}
	public Timestamp getHoraInclusao() {
		return horaInclusao;
	}
	public void setHoraInclusao(Timestamp horaInclusao) {
		this.horaInclusao = horaInclusao;
	}
	public Timestamp getHoraAlteracao() {
		return horaAlteracao;
	}
	public void setHoraAlteracao(Timestamp horaAlteracao) {
		this.horaAlteracao = horaAlteracao;
	}
	
	

}
