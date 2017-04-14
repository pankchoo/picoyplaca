package paquetepicoplaca;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiasemanaTest {

	@Test
	public void test() {
		Metodosproceso test=new Metodosproceso();
		String output=test.getDiaSemana("2017-04-10");
		assertEquals("Monday",output);
		//assertEquals("Tuesday",output); //try it with an ERROR
	}

}
