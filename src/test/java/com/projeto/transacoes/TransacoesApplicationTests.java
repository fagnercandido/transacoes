package com.projeto.transacoes;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.projeto.servico.TransacaoServico;
import com.projeto.transacoes.modelo.Transacao;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransacoesApplicationTests {

    @Autowired
    private TransacaoServico transacaoServico;
    
    @Test
    public void testTrackingIdIsCorrect() {
    	List<Transacao> transacoes = transacaoServico.recuperarTransacoes();
    	assertEquals("dflkajslçkfjdaslkjflçkasdjf54646dsafadsfadsf", transacoes.stream().findFirst().get().getTrackingId());
    }

}
