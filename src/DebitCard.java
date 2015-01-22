
public class DebitCard 
{
	private static int fLastDebitCardNumber;
	private CheckingAccount fAccountConnectedTo;
	private int fDebitCardNumber;
	private Person fPerson;
	
	public DebitCard(Person person)
	{
		fDebitCardNumber = fLastDebitCardNumber;
		fLastDebitCardNumber++;
		fPerson = person;
	}
	
	public DebitCard(Person person, double limit, CheckingAccount account)
	{
		fDebitCardNumber = fLastDebitCardNumber;
		fLastDebitCardNumber++;
		fAccountConnectedTo = account;
		fPerson = person;
	}
	
	public boolean pay(double amount)
	{
		if((fAccountConnectedTo.getBalance() - amount) < -fAccountConnectedTo.getDebitAmount())
		{
			fAccountConnectedTo.setBalance(fAccountConnectedTo.getBalance() - amount);
			return true;
		}
		else
		{
			return false;
		}
	}

}
