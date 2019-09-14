package com.projeto.transacoes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Merchant {

	@Id
	@GeneratedValue
	private Long id;

	private Long merchantCode;

	private Long acceptor;

	public Merchant(Long merchantCode, Long acceptor) {
		this.merchantCode = merchantCode;
		this.acceptor = acceptor;
	}

	public Long getId() {
		return id;
	}

	public Long getMerchantCode() {
		return merchantCode;
	}

	public Long getAcceptor() {
		return acceptor;
	}

}
