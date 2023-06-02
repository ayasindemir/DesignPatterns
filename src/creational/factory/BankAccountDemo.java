package creational.factory;

public class BankAccountDemo {

	public static void main(String[] args) throws InvalidAccountTypeException {

		BankAccountFactory factory = new BankAccountFactory();

		BankAccount account = factory.createAccount(AccountType.BUSINESS);
		account.registerAccount();

		account = factory.createAccount(AccountType.PERSONAL);
		account.registerAccount();

		account = factory.createAccount(AccountType.CHECKING);
		account.registerAccount();

		account = factory.createAccount(null);
		account.registerAccount();

	}

}
