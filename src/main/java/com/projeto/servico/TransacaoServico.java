package com.projeto.servico;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projeto.transacoes.modelo.Transacao;
import com.projeto.transacoes.persistencia.TransacaoRepository;

@Service
public class TransacaoServico {

	private TransacaoRepository transacaoRepository;

	public List<Transacao> recuperarTransacoes() {
		return transacaoRepository.findAll();
	}

	public void salvarTransacoes(Transacao transacao) {
		transacaoRepository.save(transacao);
	}

}
