package creational.factory;

public class BankAccountFactory {

	public BankAccount createAccount(AccountType type) throws InvalidAccountTypeException {

		BankAccount account = null;

		switch (type) {
		case PERSONAL:
			account = new PersonalAccount();
			break;
		case CHECKING:
			account = new CheckingAccount();
			break;
		case BUSINESS:
			account = new BusinessAccount();
			break;
		default:
			throw new InvalidAccountTypeException(type.name() + " is invalid Account Type...");
		}

		return account;

	}

}
