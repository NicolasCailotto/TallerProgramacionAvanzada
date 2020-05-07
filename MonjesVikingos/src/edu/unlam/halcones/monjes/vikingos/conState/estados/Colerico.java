package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public class Colerico extends Estado {

	public Colerico(BigDecimal multiplicadorAtaque, BigDecimal multiplicadorDefensa) {
		super(multiplicadorAtaque, multiplicadorDefensa);
	}

	@Override
	public Estado recibirAtaque() {
		return new Berserker(new BigDecimal(3), new BigDecimal(0.5));
	}

}
