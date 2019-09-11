package com.projeto.transacoes.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Amount {

	@Id
	@GeneratedValue
	private Long id;
	
	private BigDecimal amount;
	private CurrencyCode currencyCode;

	public Amount(BigDecimal amount, CurrencyCode currencyCode) {
		this.amount = amount;
		this.currencyCode = currencyCode;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public CurrencyCode getCurrencyCode() {
		return currencyCode;
	}

}
