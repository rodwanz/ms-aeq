package com.wanzeler.pagamento.entities;

import java.io.Serializable;

public class Pagamento implements Serializable{
	private static final long serialVersionUID = 562092518895148121L;
	
	private Long id;
	private Integer estoque;
	
	public Pagamento(){}

	public Pagamento(Long id, Integer estoque) {
		super();
		this.id = id;
		this.estoque = estoque;
	}

	public Pagamento(long produtoId, String nome, Integer estoque2) {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}
}
