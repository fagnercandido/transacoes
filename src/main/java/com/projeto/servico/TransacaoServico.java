package com.projeto.servico;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.projeto.transacoes.modelo.Amount;
import com.projeto.transacoes.modelo.CurrencyCode;
import com.projeto.transacoes.modelo.Transacao;

@Service
public class TransacaoServico {

	public Transacao recuperarTransacoes() {
		Amount amount = new Amount(BigDecimal.valueOf(120), CurrencyCode.REAL);
		return new Transacao("dflkajslçkfjdaslkjflçkasdjf54646dsafadsfadsf", amount);
	}

}
