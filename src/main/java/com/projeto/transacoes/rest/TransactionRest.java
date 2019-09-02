package com.projeto.transacoes.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.transacoes.modelo.Transacao;

@RestController
public class TransactionRest {
	
	@RequestMapping("/transacoes")
    public Transacao recuperarTransacao() {
        return new Transacao("dflkajslçkfjdaslkjflçkasdjf54646dsafadsfadsf");
    }

}
