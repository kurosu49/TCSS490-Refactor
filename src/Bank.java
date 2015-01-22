import java.util.Vector;


public class Bank 
{
	private String fName;
	private Vector<CheckingAccount> fCheckingAccounts;
	private Vector<SavingsAccount> fSavingAccounts;
	private Person fPerson;
	
	public Bank(String name)
	{
		fName = name;
		fCheckingAccounts = new Vector<CheckingAccount>();
		fSavingAccounts = new Vector<SavingsAccount>();
		fPerson = new Person("Bob Smith", "1 Main St.", "12345", "Tacoma", "USA");
	}
	
	public int openSimpleCheckingAccount()
	{
		CheckingAccount newAccount = new CheckingAccount(fPerson);
		fCheckingAccounts.add(newAccount);
		return newAccount.getAccountNumber();
	}
	
	public int openFullPackage()
	{
		CheckingAccount newAccount = new CheckingAccount(fPerson);
		fCheckingAccounts.add(newAccount);
		newAccount.applyForCreditCard(fPerson, newAccount.getAccountNumber());
		SavingsAccount newSavingsAccount = new SavingsAccount(fPerson);
		fSavingAccounts.add(newSavingsAccount);
		DebitCard newDebetCard = new DebitCard(fPerson, 0, newAccount);
		return newAccount.getAccountNumber();
	}
	
	public boolean withdrawMoney(int accountNumber, double amount)
	{
		CheckingAccount account = new CheckingAccount(accountNumber);
		int index = fCheckingAccounts.indexOf(account);
		return fCheckingAccounts.elementAt(index).withdrawal(amount);
	}
	
}
