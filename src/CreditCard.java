
public class CreditCard 
{
	private static final int STANDARD_LIMIT = 2500; //refactor 1
	//refactor 2 variables that used to be on line 5-7 were unused and deleted
	private double fLimit; // you cannot spend more than this limit
	private double fBalance;
	private Person fPerson;//refactor 5
	
	public CreditCard(Person person)
	{
		fLimit = STANDARD_LIMIT; // refactor 1
		fBalance = 0;
		fPerson = person;
	}
	
	public CreditCard(Person person, double limit)
	{
		fLimit = limit;
		fBalance = 0;
		fPerson = person;
	}
	
	public boolean pay(double amount)
	{
		if((fBalance - amount) < -fLimit)
		{
			fBalance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
}
