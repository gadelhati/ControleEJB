package br.eti.gadelha.ejb.controle.modelo.oque.quem;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * @autor Marcelo Ribeiro Gadelha
 * @since 27/08/2015
 * @see www.gadelha.eti.br
 **/

@Entity
@Table(name="pessoaFisica")
@PrimaryKeyJoinColumn(name = "id")
public class PessoaFisica extends Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Column(length=11, unique = true, nullable = false)
	private String rg;
	@Column(length=15, unique = true, nullable = false)
	private String cpf;
	@Column(unique = true)
	private String assinatura;
	
	public PessoaFisica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PessoaFisica(long id, Date nascimento, String nome, String sexo) {
		super(id, nascimento, nome, sexo);
		// TODO Auto-generated constructor stub
	}
	public PessoaFisica(String rg, String cpf, String assinatura) {
		super();
		this.rg = rg;
		this.cpf = cpf;
		this.assinatura = assinatura;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (assinatura == null) {
			if (other.assinatura != null)
				return false;
		} else if (!assinatura.equals(other.assinatura))
			return false;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (rg == null) {
			if (other.rg != null)
				return false;
		} else if (!rg.equals(other.rg))
			return false;
		return true;
	}
	public String getAssinatura() {
		return assinatura;
	}
	public String getCpf() {
		return cpf;
	}
	public String getRg() {
		return rg;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((assinatura == null) ? 0 : assinatura.hashCode());
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result + ((rg == null) ? 0 : rg.hashCode());
		return result;
	}
	public void setAssinatura(String assinatura) {
		this.assinatura = assinatura;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	@Override
	public String toString() {
		return "PessoaFisica [rg=" + rg + ", cpf=" + cpf + ", assinatura=" + assinatura + "]";
	}
}