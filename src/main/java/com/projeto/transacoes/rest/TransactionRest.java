package com.projeto.transacoes.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.servico.TransacaoServico;
import com.projeto.transacoes.modelo.Transacao;

@RestController
public class TransactionRest {
	
	@Autowired
	private TransacaoServico transacaoServico;
	
	
	@RequestMapping("/transacoes")
    public Transacao recuperarTransacao() {
        return transacaoServico.recuperarTransacoes();
    }

}
