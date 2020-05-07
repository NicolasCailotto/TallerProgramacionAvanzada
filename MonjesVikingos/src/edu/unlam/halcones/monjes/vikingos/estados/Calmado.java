package edu.unlam.halcones.monjes.vikingos.estados;

public class Calmado extends Estado{

	@Override
	public Estado atacar() {
		return new Normal();
	}
	
	@Override
	public Estado meditar() {
		return this;
	}
}
