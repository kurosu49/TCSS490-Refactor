
public class SavingsAccount {
	private int fAccountNumber;
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double interestRate = 1.25;
	private static int fNextAccountNumber = 0;
	private Person fPerson;
	
	public SavingsAccount(Person person)
	{
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fPerson = person;
	}
	
	public void calculateInterest()
	{
		fBalance = fBalance + (fBalance * interestRate / 100);
	}
	
	public boolean withdrawal(double amount)
	{
		if(((fBalance - amount) < 0))
		{
			return false;
		}
		else
		{
			fBalance = fBalance - amount;
			return true;
		}
	}
	
	public void verseMoney(double amount)
	{
		fBalance += amount;
	}
	
	public void print()
	{
		System.out.println("**************************************");
		System.out.println("Savings account:     " + fAccountNumber);
		System.out.println("Account holder name: " + fPerson.getName());
		System.out.println("Address:             " + fPerson.getStreet());
		System.out.print("                     " + fPerson.getZipcode());
		System.out.println(" " + fPerson.getTown());
		System.out.println(fPerson.getCountry().toUpperCase());
		System.out.println("**************************************");
		System.out.println("Balance:  " + fBalance);
		System.out.println("**************************************");
	}
	
	
}
