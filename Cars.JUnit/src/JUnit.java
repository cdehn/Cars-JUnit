import static org.junit.Assert.*;

import org.junit.Test;


public class JUnit {

	@Test
	public void testSideCar() {
		Motorcycle noSideCar = new Motorcycle(false);
		assertFalse("No side car on motorcycle", noSideCar.gethasSideCar());
	}
	
	@Test
	public void testOwnership(){
		Person a = new Person();
		Truck truck = new Truck(2, a);	
		truck.setOwner(a);
		Person b = new Person();
		truck.ownership(b);
		
		assertTrue("Transfer ownership to Person b", truck.getOwner());
	}
	
}
