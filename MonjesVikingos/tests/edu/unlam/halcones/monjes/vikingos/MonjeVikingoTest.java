package edu.unlam.halcones.monjes.vikingos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.unlam.halcones.monjes.vikingos.estados.Normal;

public class MonjeVikingoTest {

	MonjeVikingo monje;

	@Before
	public void setUp() {
		monje = new MonjeVikingo();
	}

	@Test
	public void creacionConEstadoNormal() {
		assertEquals(Normal.class, monje.getEstado().getClass());
	}

}
