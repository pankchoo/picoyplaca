package paquetepicoplaca;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculacionTest {

	@Test
	public void test() {
		Metodosproceso test=new Metodosproceso();
		String output=test.getCirculacion("Monday", "07:50", "PBA-1356" );
		assertEquals("<label class='alert alert-success'> The car CAN be on the road </label>",output);
		//assertEquals("<label class='alert alert-success'> The car CAN NOT be on the road </label>",output); //Try it with an error
	}

}
