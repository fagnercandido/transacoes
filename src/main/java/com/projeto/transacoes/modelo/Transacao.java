package com.projeto.transacoes.modelo;

public class Transacao {

	private String trackingId;
	private Amount amount;

	public String getTrackingId() {
		return trackingId;
	}

	public Amount getAmount() {
		return amount;
	}

	public Transacao(String trackingId, Amount amount) {
		this.trackingId = trackingId;
		this.amount = amount;
	}

}
