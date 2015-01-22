-Commit 12----------------------------------------------------------------------------
Deleted all commented code that I commented out from the previous versions. 

-Commit 11----------------------------------------------------------------------------
Made edits in Bank class where variables were being initialized after I refactored
all the other classes by changing their parameters to Person type where applicable. I also
made changes in the CheckingAccount class again for applyForCreditCard. I forgot to 
change its parameters earlier and changed the if statement checks to check the passed
in person through the parameter instead of the field fPerson. 

-Commit 10----------------------------------------------------------------------------
I moved onto the CheckingAccount class and changed its parameter to Person.

BadSmell removed from previous version:
Class: SavingsAccount
Long parameter list for constructor. Deleted those parameters and instead
put a Person as a parameter. Also made edits to the print method as result
of changing the parameters. Example, for fName I changed it to fPerson.getName().
I also made changes to the applyForCreditCard() method where fCreditCard is
being initialized I pass in fPerson for the parameter. 

-Commit 9-----------------------------------------------------------------------------
I moved onto the SavingsAccount class and changed its parameter to Person. 

BadSmell removed from previous version:
Class: SavingsAccount
Long parameter list for constructor. Deleted those parameters and instead
put a Person as a parameter. Also made edits to the print method as result
of changing the parameters. Example, for fName I changed it to fPerson.getName().

-Commit 8-----------------------------------------------------------------------------
Next, I went and made the same changes in the DebitCard class. I also made a minor
edit I forgot to put in the CreditCard class. I assigned the value of the parameter
to fPerson. So fPerson = person.

BadSmell removed from previous version:
Class: DebitCard
Long parameter list for constructors. Deleted those parameters and instead
put a Person as a parameter. 

-Commit 7-----------------------------------------------------------------------------
After creating the Person class I went ahead and started to make changes with
the CreditCard class. 

BadSmell removed from previous version:
Class: CreditCard
Long parameter list for constructors. Deleted those parameters and instead
put a Person as a parameter. 

-Commit 6-----------------------------------------------------------------------------
Noticed some similarities in the parameters of each classes constructor and methods.
They all need: name, street, town, zipcode, and country. This is in a lot of the
parameters for their constructors and methods and this long list of parameters can
be reduced. This problem is present in CheckingAccount, CreditCard, Bank, DebitCard,
and SavingsAccount. 

To begin refactoring this problem I created a Person class. 

-Commit 5-----------------------------------------------------------------------------
Revised the refactor from previous version:
Added private static CreditCard fCreditCard back to line 16.
So the removed variables are fSavingsAccount and fDebitCard from line 17-18.

-Commit 4-----------------------------------------------------------------------------
Bad Smell removed from previous version:
Class:CheckingAccount
Unused variables on line 16-18 named: fCreditCard,fSavingsAccount,
									  fDebitCard.
is fixed by deleting those three variables. 

-Commit 3-----------------------------------------------------------------------------
Bad Smell removed from previous version:
Class:CreditCard
Unused variables on line 5-7 named: fLastCreditCardNumber,fAccountConnectedTo,
									fCreditCardNumber.
is fixed by deleting those three variables. 	

-Commit 2-----------------------------------------------------------------------------
Bad Smell removed from previous version:
Class:CreditCard
At line 22:
	fLimit = 2500;
is fixed with these two modifications:
	private static final int STANDARD_LIMIT = 2500; //added at line 4
	fLimit = STANDARD_LIMIT; //assigned value is changed from 2500 to STANDARD_LIMIT

-Commit 1-----------------------------------------------------------------------------
Bad Smell removed from previous version:
	None, this was just the initial commit. 
	