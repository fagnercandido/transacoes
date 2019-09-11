package com.projeto.transacoes.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.transacoes.modelo.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, String> {

}
