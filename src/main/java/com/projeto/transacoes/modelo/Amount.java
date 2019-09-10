package com.projeto.transacoes.modelo;

import java.math.BigDecimal;

public class Amount {

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
