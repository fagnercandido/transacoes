package com.projeto.servico;

import java.lang.reflect.Field;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.projeto.transacoes.anotacoes.PagamentoMinimo;
import com.projeto.transacoes.modelo.Amount;
import com.projeto.transacoes.modelo.CurrencyCode;
import com.projeto.transacoes.modelo.Merchant;
import com.projeto.transacoes.modelo.Pagamento;
import com.projeto.transacoes.modelo.Terminal;
import com.projeto.transacoes.modelo.TipoPagamento;
import com.projeto.transacoes.modelo.TipoTerminal;
import com.projeto.transacoes.modelo.Transacao;
import com.projeto.transacoes.persistencia.TransacaoRepository;

@Service
public class TransacaoServico {
	
	private TransacaoRepository transacaoRepository;

	public Transacao recuperarTransacoes() {
		Amount amount = new Amount(BigDecimal.valueOf(120), CurrencyCode.EURO);
		
		validador(amount);
		
		Merchant merchant = new Merchant(5L, 4L);
		Terminal terminal =  new Terminal(7L, TipoTerminal.MBWAY);
		Pagamento pagamento = new Pagamento(TipoPagamento.PAGAMENTO_REFERENCIA);
		return new Transacao("dflkajslçkfjdaslkjflçkasdjf54646dsafadsfadsf", amount, merchant, terminal, pagamento);
	}

	private boolean validador(Amount amount) {
		Class<? extends Amount> classe = amount.getClass();
		for (Field field : classe.getDeclaredFields()) {
			if (field.isAnnotationPresent(PagamentoMinimo.class)) {
				PagamentoMinimo pagamentoMinimo = field.getAnnotation(PagamentoMinimo.class);
				field.setAccessible(true);
				try {
					BigDecimal valor = (BigDecimal) field.get(amount);
					double doubleValue = valor.doubleValue();
					return doubleValue > pagamentoMinimo.valor();
				} catch (IllegalArgumentException | IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
	}

}
