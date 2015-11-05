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
 * @since 15/10/2015
 * @see www.gadelha.eti.br
 **/

@Entity
@Table(name="grupo")
public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id @Column(length=16, nullable = false, unique = true)
	private long id;
	@Temporal(TemporalType.DATE)
	private Date fim;
	@Temporal(TemporalType.DATE)
	private Date inicio;
	@Column(length=45, nullable = false)
	private String nome;
	@Column(length=45, nullable = false)
	private String cor;
	
}