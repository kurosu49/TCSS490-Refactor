
public class Person {
	
	private String fName;
	private String fStreet;
	private String fTown;
	private String fZipcode;
	private String fCountry;
	
	public Person(String name, String street, String town, String zipcode, String country) {
		fName = name;
		fStreet = street;
		fZipcode = zipcode;
		fTown = town;
		fCountry = country;
	}
	
	@Override
	public String toString() {
		return getName() + "\n" + getStreet() + "\n" + getTown() + "\n" + getZipcode() + "\n" + getCountry();
	}
	
	public void setName(String name) {
		fName = name;
	}
	
	public String getName() {
		return fName;
	}
	
	public void setStreet(String street) {
		fStreet = street;
	}
	
	public String getStreet() {
		return fStreet;
	}
	
	public void setTown(String town) {
		fTown = town;
	}
	
	public String getTown() {
		return fTown;
	}
	
	public void setZipcode(String zipcode) {
		fZipcode = zipcode;
	}
	
	public String getZipcode() {
		return fZipcode;
	}
	
	public void setCountry(String country) {
		fCountry = country;
	}
	
	public String getCountry() {
		return fCountry;
	}
	

}
