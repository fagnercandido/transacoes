package com.projeto.transacoes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pagamento {

	@Id
	@GeneratedValue
	private Long id;

	private TipoPagamento tipoPagamento;

	public Pagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public Long getId() {
		return id;
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

}
