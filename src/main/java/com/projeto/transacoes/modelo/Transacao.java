package com.projeto.transacoes.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Transacao {

	@Id
	private String trackingId;

	@OneToOne(cascade = CascadeType.ALL)
	private Amount amount;

	@OneToOne(cascade = CascadeType.ALL)
	private Merchant merchant;

	@OneToOne(cascade = CascadeType.ALL)
	private Terminal terminal;

	@OneToOne(cascade = CascadeType.ALL)
	private Pagamento pagamento;

	public Pagamento getPagamento() {
		return pagamento;
	}

	public String getTrackingId() {
		return trackingId;
	}

	public Amount getAmount() {
		return amount;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public Transacao(String trackingId, Amount amount, Merchant merchant, Terminal terminal, Pagamento pagamento) {
		this.trackingId = trackingId;
		this.amount = amount;
		this.merchant = merchant;
		this.terminal = terminal;
		this.pagamento = pagamento;
	}

}
