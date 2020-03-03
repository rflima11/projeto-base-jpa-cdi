package com.stefanini.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CO_SEQ_PERFIL")
	private long id;
	@NotNull
	@Column(name="NO_PERFIL")
	private String perfil;
	@NotNull
	@Column(name="DS_PERFIL")
	private String descricaoPerfil;
	@NotNull
	@Column(name="DT_HORA_INCLUSAO")
	private Timestamp horaInclusao;
	@NotNull
	@Column(name="DT_HORA_ALTERACAO")
	private Timestamp horaAlteracao;
	
	public Perfil() {
		
	}

	public Perfil(String perfil, String descricaoPerfil, Timestamp horaInclusao, Timestamp horaAlteracao) {
		super();
		this.perfil = perfil;
		this.descricaoPerfil = descricaoPerfil;
		this.horaInclusao = horaInclusao;
		this.horaAlteracao = horaAlteracao;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descricaoPerfil == null) ? 0 : descricaoPerfil.hashCode());
		result = prime * result + ((horaAlteracao == null) ? 0 : horaAlteracao.hashCode());
		result = prime * result + ((horaInclusao == null) ? 0 : horaInclusao.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (descricaoPerfil == null) {
			if (other.descricaoPerfil != null)
				return false;
		} else if (!descricaoPerfil.equals(other.descricaoPerfil))
			return false;
		if (horaAlteracao == null) {
			if (other.horaAlteracao != null)
				return false;
		} else if (!horaAlteracao.equals(other.horaAlteracao))
			return false;
		if (horaInclusao == null) {
			if (other.horaInclusao != null)
				return false;
		} else if (!horaInclusao.equals(other.horaInclusao))
			return false;
		if (id != other.id)
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", perfil=" + perfil + ", descricaoPerfil=" + descricaoPerfil + ", horaInclusao="
				+ horaInclusao + ", horaAlteracao=" + horaAlteracao + "]";
	}
	
	
}
