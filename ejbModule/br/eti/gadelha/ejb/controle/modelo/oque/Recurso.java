package br.eti.gadelha.ejb.controle.modelo.oque;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @autor Marcelo Ribeiro Gadelha
 * @since 27/08/2015
 * @see www.gadelha.eti.br
 **/

@Entity
@Table(name="recurso")
@PrimaryKeyJoinColumn(name = "id")
public class Recurso extends Ferramenta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.DATE)
	private Date horasDia;
	@Column
	private long qtdMin;
	@Column
	private long qtdMax;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<Recurso> recursos;
	
	public Recurso() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recurso(Date horasDia, long qtdMin, long qtdMax, List<Recurso> recursos) {
		super();
		this.horasDia = horasDia;
		this.qtdMin = qtdMin;
		this.qtdMax = qtdMax;
		this.recursos = recursos;
	}
	public Recurso(long id, byte focoTotal) {
		super(id, focoTotal);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recurso other = (Recurso) obj;
		if (horasDia == null) {
			if (other.horasDia != null)
				return false;
		} else if (!horasDia.equals(other.horasDia))
			return false;
		if (qtdMax != other.qtdMax)
			return false;
		if (qtdMin != other.qtdMin)
			return false;
		if (recursos == null) {
			if (other.recursos != null)
				return false;
		} else if (!recursos.equals(other.recursos))
			return false;
		return true;
	}
	public Date getHorasDia() {
		return horasDia;
	}
	public long getQtdMax() {
		return qtdMax;
	}
	public long getQtdMin() {
		return qtdMin;
	}
	public List<Recurso> getRecursos() {
		return recursos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((horasDia == null) ? 0 : horasDia.hashCode());
		result = prime * result + (int) (qtdMax ^ (qtdMax >>> 32));
		result = prime * result + (int) (qtdMin ^ (qtdMin >>> 32));
		result = prime * result + ((recursos == null) ? 0 : recursos.hashCode());
		return result;
	}
	public void setHorasDia(Date horasDia) {
		this.horasDia = horasDia;
	}
	public void setQtdMax(long qtdMax) {
		this.qtdMax = qtdMax;
	}
	public void setQtdMin(long qtdMin) {
		this.qtdMin = qtdMin;
	}
	public void setRecursos(List<Recurso> recursos) {
		this.recursos = recursos;
	}
	@Override
	public String toString() {
		return "Recurso [horasDia=" + horasDia + ", qtdMin=" + qtdMin + ", qtdMax=" + qtdMax + ", recursos=" + recursos
				+ "]";
	}
}