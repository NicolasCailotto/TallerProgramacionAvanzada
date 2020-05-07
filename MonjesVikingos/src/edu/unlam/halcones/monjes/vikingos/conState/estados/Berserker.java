package edu.unlam.halcones.monjes.vikingos.conState.estados;

import java.math.BigDecimal;

public class Berserker extends Estado {

	public Berserker(BigDecimal multiplicadorAtaque, BigDecimal multiplicadorDefensa) {
		super(multiplicadorAtaque, multiplicadorDefensa);
	}

	@Override
	public Estado meditar() {
		return new Normal();
	}

}
