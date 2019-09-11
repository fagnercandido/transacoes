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
