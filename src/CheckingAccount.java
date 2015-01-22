
public class CheckingAccount 
{
	private int fAccountNumber;
	private boolean fDebitAllowed;
	private double fDebitAmount;
	private double fBalance;
	private static double costs = 1; // per period there is a cost associated with this account
									// that equals 1 pound
	private static double debitRate = 4.7;
	private static CreditCard fCreditCard;
	//refactor 3 variables that used to be on line 17-18 were unused and were deleted.
	private static int fNextAccountNumber = 0;
	private Person fPerson;
	
	public CheckingAccount(Person person)
	{
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = false;
		fDebitAmount = 0;
		fPerson = person;
	}
	
	public CheckingAccount(Person person, float debit)
	{
		fAccountNumber = fNextAccountNumber;
		fNextAccountNumber++;
		fDebitAllowed = true;
		fDebitAmount = debit;
		fPerson = person;
	}
	
	public CheckingAccount(int accountnumber)
	{
		fAccountNumber = accountnumber;
	}
	
	public void determineCosts()
	{
		fBalance = fBalance - costs;
		if(fBalance < 0)
		{
			fBalance = fBalance - (fBalance * debitRate / 100);
		}
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
	
	public boolean withdrawal(double amount)
	{
		if(((fBalance - amount) < 0) && (!fDebitAllowed))
		{
			return false;
		}
		else if((fBalance - amount) < -fDebitAmount)
		{
			fBalance = fBalance - amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void verseMoney(double amount)
	{
		fBalance += amount;
	}
	
	public boolean applyForCreditCard(Person person, int accountNumber)
	{
		if(fBalance < 0)
		{
			return false;
		}
		if(fBalance <= 2500)
		{
			fCreditCard = new CreditCard(person);
		}
		else
		{
			fCreditCard = new CreditCard(person, 5000);
		}
		return true;
	}
	
	public double getBalance()
	{
		return fBalance;
	}
	
	public void increaseBalance(double amount)
	{
		fBalance += amount;
	}
	
	public void decreaseBalance(double amount)
	{
		fBalance -= amount;
	}

	public double getDebitAmount()
	{
		return fDebitAmount;
	}

	public void setBalance(double amount)
	{
		fBalance = amount;	
	}

	public int getAccountNumber() 
	{
		return fAccountNumber;	
	}
	
	public boolean equals(Object o)
	{
		if(fAccountNumber == ((CheckingAccount)o).fAccountNumber)
			return true;
		else
			return false;
				
	}
}
