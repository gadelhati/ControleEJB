package br.eti.gadelha.ejb.controle.modelo.oque;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @autor Marcelo Ribeiro Gadelha
 * @since 14/10/2015
 * @see www.gadelha.eti.br
 **/

//ESTOQUE, INVENTÁRIO, ALIMENTO(a, b12, c, sódio), REMÉDIO

@Entity
@Table(name="ferramenta")
@Inheritance(strategy=InheritanceType.JOINED)
public class Ferramenta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id @Column(length=16, nullable = false, unique = true)
	private long id;
	@Column
	private byte focoTotal;
	
	public Ferramenta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ferramenta(long id, byte focoTotal) {
		super();
		this.id = id;
		this.focoTotal = focoTotal;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ferramenta other = (Ferramenta) obj;
		if (focoTotal != other.focoTotal)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	public byte getFocoTotal() {
		return focoTotal;
	}
	public long getId() {
		return id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + focoTotal;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
	public void setFocoTotal(byte focoTotal) {
		this.focoTotal = focoTotal;
	}
	public void setId(long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Ferramenta [id=" + id + ", focoTotal=" + focoTotal + "]";
	}
}