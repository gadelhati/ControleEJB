package br.eti.gadelha.ejb.controle.modelo.oque;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @autor Marcelo Ribeiro Gadelha
 * @since 27/08/2015
 * @see www.gadelha.eti.br
 **/

@Entity
@Table(name="funcao")
public class Funcao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @Column(length=16, nullable = false, unique = true)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date fim;
	@Temporal(TemporalType.DATE)
	private Date inicio;
	@Column(length=45, nullable = false)
	private String nome;
	
	//MANY TO MANY!
	
	public Funcao() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcao(long id) {
		super();
		this.id = id;
	}
	public Funcao(long id, Date fim, Date inicio, String nome) {
		super();
		this.id = id;
		this.fim = fim;
		this.inicio = inicio;
		this.nome = nome;
	}
	public Funcao(long id, Date fim, String nome) {
		super();
		this.id = id;
		this.fim = fim;
		this.nome = nome;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Funcao other = (Funcao) obj;
		if (fim == null) {
			if (other.fim != null)
				return false;
		} else if (!fim.equals(other.fim))
			return false;
		if (id != other.id)
			return false;
		if (inicio == null) {
			if (other.inicio != null)
				return false;
		} else if (!inicio.equals(other.inicio))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public Date getFim() {
		return fim;
	}
	public long getId() {
		return id;
	}
	public Date getInicio() {
		return inicio;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fim == null) ? 0 : fim.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((inicio == null) ? 0 : inicio.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	public void setFim(Date fim) {
		this.fim = fim;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Funcao [id=" + id + ", fim=" + fim + ", inicio=" + inicio + ", nome=" + nome + "]";
	}
}