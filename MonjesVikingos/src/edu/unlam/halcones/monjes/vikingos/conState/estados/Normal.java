package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public class Normal extends Estado {

	public Normal() {
		super();
	}

	@Override
	public Estado recibirAtaque() {
		return new Colerico(new BigDecimal(2), new BigDecimal(2));
	}

	@Override
	public Estado meditar() {
		return new Calmado();
	}
}
