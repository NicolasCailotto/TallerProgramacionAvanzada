package edu.unlam.halcones.monjes.vikingos.conState;

import edu.unlam.halcones.monjes.vikingos.conState.estados.Normal;
import org.junit.Before;
import org.junit.Test;

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
