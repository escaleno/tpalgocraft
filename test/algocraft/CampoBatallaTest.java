package algocraft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import model.CampoBatalla;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class CampoBatallaTest {

	
	@Before
	public void setUp() {
	
	}
	
	@Test
	public void getInstanciaDeberiaRetornarNoNulo() {
		assertNotNull(CampoBatalla.getInstancia());
	}
	
	@Test
	public void testInstanciaDefecto(){
		assertEquals(10,CampoBatalla.getInstancia().getAncho());
		assertEquals(10,CampoBatalla.getInstancia().getAlto());
	}
	
	@Test
	public void testSettersAltoYAncho() {
		
		CampoBatalla.getInstancia().setAlto(20);
		CampoBatalla.getInstancia().setAncho(25);
		
		assertEquals(25,CampoBatalla.getInstancia().getAncho());
		assertEquals(20,CampoBatalla.getInstancia().getAlto());
	}
	
	
	

}

