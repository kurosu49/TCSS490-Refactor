import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BankTest {
	private Bank bankTest;
	
	@Before
	public void setUp() throws Exception {
		bankTest = new Bank("JOHN DOE!");
	}
	
	@Test
	public void openSimpleCheckingAccountTest() {
		assertEquals(bankTest.openSimpleCheckingAccount(), 0);
	}

	@Test
	public void openFullPackageTest() {
		assertEquals(bankTest.openFullPackage(), 1);
	}
	
	@Test
	public void withdrawMoneyTets() {
		assertTrue(bankTest.withdrawMoney(0, -1000));
		assertTrue(bankTest.withdrawMoney(1, 0));
	}
}
