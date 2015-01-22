import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CreditCardTest {
	
	private CreditCard card1;
	private CreditCard card2;

	@Before
	public void setUp() throws Exception {
		card1 = new CreditCard(new Person("Joe", "123", "A Town", "00000", "AH"));
		card2 = new CreditCard(new Person("James", "456", "B Town", "00001", "BAH"), 3000);
	}

	@Test
	public void testPayFalse() {
		assertFalse(card2.pay(2900));
	}
	
	@Test
	public void testPayTrue() {
		assertTrue(card1.pay(4000));
	}


}
