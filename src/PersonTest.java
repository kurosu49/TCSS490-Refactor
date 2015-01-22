import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class PersonTest {

	private static final int SIZE = 3;
	private Person person[];
	
	@Before
	public void setUp() throws Exception {
		person = new Person[SIZE];
		person[0] = new Person("Joe", "123", "A Town", "00000", "AH");
		person[1] = new Person("Jane", "456", "B Town", "11111", "BAH");
		person[2] = new Person("Jack", "789", "C Town", "22222", "CAH");
	}

	/**
	 * Tests the creation of a Person
	 */
	@Test
	public void testPerson() {
		Person p = new Person("Jill", "101", "D Town", "33333", "DAH");
		String name = "Jill";
		String street = "101";
		String town = "E Town";
		String zip = "33333";
		String country = "Nowhere";
		assertEquals("Should be equal", name, p.getName());
		assertEquals("Should be equal", street, p.getStreet());
		assertNotSame("Should not be equal", town, p.getTown());
		assertEquals("Should be equal", zip, p.getZipcode());
		assertNotSame("Should not be equal",country, p.getCountry());
	}

	/**
	 * Test the toString method
	 */
	@Test
	public void testToString() {
		String test_string = "Joe" + "\n" + "123" + "\n" + "A Town" + "\n" + "00000" + "\n" + "AH";
		assertEquals("Should be equal", test_string, person[0].toString());
		assertNotSame("Not the same.", test_string, person[2].toString());
	}

	/**
	 * Checks if retrieval and changes made to name are correct
	 */
	@Test
	public void testGetAndSetName() {
		String new_name = "Chad";
		assertEquals("Name is Jack", "Jack", person[2].getName());
		person[2].setName(new_name);
		assertNotSame("Changed name.", "Jack", person[2].getName());
		assertEquals("True. Checking name change.", new_name, person[2].getName());
	}

	/**
	 * Checks if retrieval and changes made to street are correct
	 */
	@Test
	public void testGetAndSetStreet() {
		String new_street = "000";
		assertEquals("Street is 456", "456", person[1].getStreet());
		person[1].setStreet(new_street);
		assertNotSame("Changed street.", "456", person[1].getStreet());
		assertEquals("True. Checking street change", new_street, person[1].getStreet());
	}

	/**
	 * Checks if retrieval and changes made to town are correct
	 */
	@Test
	public void testGetAndSetTown() {
		String new_town = "Woohoo Town";
		assertEquals("Town is A Town", "A Town", person[0].getTown());
		person[0].setTown(new_town);
		assertNotSame("Changed town.", "A Town", person[0].getTown());
		assertEquals("True. Checking town change.", new_town, person[0].getTown());
	}
	
	/**
	 * Checks if retrieval and changes made to zipcode are correct
	 */
	@Test
	public void testGetAndSetZipcode() {
		String new_zipcode = "77777";
		assertEquals("Zipcode is 11111", "11111", person[1].getZipcode());
		person[1].setZipcode(new_zipcode);
		assertNotSame("Zipcode is 11111", "11111", person[1].getZipcode());
		assertEquals("True. Checking zipcode.", new_zipcode, person[1].getZipcode());
	}
	
	/**
	 * Checks if retrieval and changes made to country are correct
	 */
	@Test
	public void testGetAndSetCountry() {
		String new_country = "US";
		assertEquals("Country is CAH", "CAH", person[2].getCountry());
		person[2].setCountry(new_country);
		assertNotSame("Country is CAH", "CAH", person[2].getCountry());
		assertEquals("True. Checking country.", new_country, person[2].getCountry());
	}

}
