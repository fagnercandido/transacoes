package com.projeto.transacoes.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.servico.TransacaoServico;
import com.projeto.transacoes.modelo.Transacao;

@RestController
public class TransactionRest {
	
	@Autowired
	private TransacaoServico transacaoServico;
	
	
	@RequestMapping(value = "/transacoes", method = RequestMethod.GET)
    public List<Transacao> recuperarTransacoes() {
        return transacaoServico.recuperarTransacoes();
    }
	
	@RequestMapping(value = "/transacoes", method = RequestMethod.POST)
    public void salvarTransacoes(@RequestBody Transacao transacao) {
        transacaoServico.salvarTransacoes(transacao);
    }

}
