/*3.Write a Java program to create an abstract class BankAccount with abstract methods 
 * deposit() and withdraw(). Create subclasses: SavingsAccount and CurrentAccount that extend
 * the BankAccount class and implement the respective methods to handle deposits and withdrawals
 *  for each account type.*/

package practice1;

abstract class BankAccount {
	abstract void deposit();

	abstract void withdraw();
}

class SavingAccount extends BankAccount {
	public void deposit() {
		System.out.println("Saving account deposite 1500 ");
	}

	public void withdraw() {
		System.out.println("Saving account Withdraw 1500 ");
	}
}

class CurrentAccount extends BankAccount {
	public void deposit() {
		System.out.println("Current account deposite salary 15000 ");
	}

	public void withdraw() {
		System.out.println("Current account withdraw his 15000 salary");
	}
}

public class Abstraction3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount SA = new SavingAccount();
		CurrentAccount CA = new CurrentAccount();
		SA.deposit();
		SA.withdraw();
		CA.deposit();
		CA.withdraw();
	}

}
