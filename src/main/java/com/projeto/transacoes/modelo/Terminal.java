package com.projeto.transacoes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Terminal {

	@Id
	@GeneratedValue
	private Long id;

	private Long terminalCode;

	private TipoTerminal tipoTerminal;

	public Terminal(Long terminalCode, TipoTerminal tipoTerminal) {
		this.terminalCode = terminalCode;
		this.tipoTerminal = tipoTerminal;
	}

	public Long getId() {
		return id;
	}

	public Long getTerminalCode() {
		return terminalCode;
	}

	public TipoTerminal getTipoTerminal() {
		return tipoTerminal;
	}

}
