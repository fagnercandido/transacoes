package com.projeto.transacoes.modelo;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.projeto.transacoes.anotacoes.PagamentoMinimo;

@Entity
public class Amount {

	@Id
	@GeneratedValue
	private Long id;
	
	@PagamentoMinimo(valor = 0.1D)
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
