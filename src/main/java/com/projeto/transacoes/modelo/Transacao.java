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

	public Transacao(Builder builder) {
		this.amount = builder.amount;
		this.merchant = builder.merchant;
		this.terminal = builder.terminal;
		this.pagamento = builder.pagamento;
	}

	public static class Builder {
		public String trackingId;
		public Amount amount;
		public Merchant merchant;
		public Terminal terminal;
		public Pagamento pagamento;

		public Builder comTrackingId(String trackingId) {
			this.trackingId = trackingId;
			return this;
		}

		public Builder comAmount(Amount amount) {
			this.amount = amount;
			return this;
		}

		public Builder comMerchant(Merchant merchant) {
			this.merchant = merchant;
			return this;
		}

		public Builder comTerminal(Terminal terminal) {
			this.terminal = terminal;
			return this;
		}

		public Builder comPagamento(Pagamento pagamento) {
			this.pagamento = pagamento;
			return this;
		}

		public Transacao build() {
			return new Transacao(this);
		}
	}

}
