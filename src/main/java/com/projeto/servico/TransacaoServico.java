package com.projeto.servico;

import java.util.List;
import java.util.Optional;

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

	public Transacao recuperarPorTrackingId(String trackingId) {
		Transacao transacao = null;
		Optional<Transacao> optionalTransacao = transacaoRepository.findById(trackingId);
		if(optionalTransacao.isPresent()) {
			Transacao tOptional = optionalTransacao.get();
			transacao = new Transacao.Builder().comAmount(tOptional.getAmount()).comTerminal(tOptional.getTerminal()).build();
		}
		return transacao;
	}

}
