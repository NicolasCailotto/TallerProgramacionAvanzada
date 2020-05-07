package edu.unlam.halcones.monjes.vikingos;

import java.math.BigDecimal;

import edu.unlam.halcones.monjes.vikingos.estados.Estado;
import edu.unlam.halcones.monjes.vikingos.estados.Normal;

public abstract class Vikingo {
	public abstract void atacar(Vikingo vikingo);
	public abstract void recibirAtaque(BigDecimal danio);
	public abstract void meditar();
	
}
