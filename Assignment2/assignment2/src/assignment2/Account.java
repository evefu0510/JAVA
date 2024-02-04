package assignment2;

//Name: FUYIJUN
//Student ID: 200552722
public class Account {
	private int accountNumber;
	private double accountBalance;
	private String accountName;

	// 1. Default constructor to leave fields blank.
	public Account() {

	}

	// 2. Constructor with 3 arguments
	public Account(String accountName, int accountNumber, double accountBalance) {
		setAccountName(accountName);
		setAccountNumber(accountNumber);
		setAccountBalance(accountBalance);
	}

	// 3. getAccountName
	public String getAccountName() {
		return accountName;
	}

	// 4. setAccountName: returns a Boolean value representing whether the account name has been updated, only update validated value
	public boolean setAccountName(String accountName) {
		if (isValidAccountName(accountName)) {
			this.accountName = accountName;
			return true;
		}
		return false;
	}

	// 5. getAccountNumber: retrieves the account number
	public int getAccountNumber() {
		return accountNumber;
	}

	// 6. setAccountNumber: returns a Boolean value representing whether the account number has been updated
	public boolean setAccountNumber(int accountNumber) {
		if (isValidateAccountNumber(accountNumber)) {
			this.accountNumber = accountNumber;
			return true;
		} else {
			return false;
		}
	}

	// 7. getAccountBalance
	public double getAccountBalance() {
		return accountBalance;
	}

	// 8. setAccountBalance
	public boolean setAccountBalance(double accountBalance) {
		if (isValidAccountBalance(accountBalance)) {
			this.accountBalance = accountBalance;
			return true;
		} else {
			return false;
		}
	}

	// 9. method: The account number can only contain positive numeric values and must be between 5 and 9 digits
	private boolean isValidateAccountNumber(int accountNumber) {
		String accountNumberStr = String.valueOf(accountNumber);
		return accountNumberStr.matches("\\d{5,9}");
	}

	// 10. method: Account name validation:
	// o The letters a to z (upper and lowercase) (zero or many times)
	// o The hyphen character (zero or many times)
	// o The single quote character (zero or one time)
	// o The space character (zero or one time)
	// • The account name must be a minimum of 4 characters
	private boolean isValidAccountName(String accountName) {
		return accountName.matches("[a-zA-Z\\-']*\\s?[a-zA-Z\\-']*")
				&& accountName.length() >= 4;
	}

	// 11. method: Validate account balance: can contain positive and negative values but must have a maximum precision of 2 decimal places.
	// o Good values: 10, 10.1, 10.22, .1, .23, 0.87, -3.34, -100
	// o Not good values: .333, 10.579
	private boolean isValidAccountBalance(double accountBalance) {
		String accountBalanceStr = String.valueOf(accountBalance);
		return accountBalanceStr.matches("-?\\d+(\\.\\d{1,2})?");
	}

	// equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Account other = (Account) obj;
		return accountNumber == other.accountNumber
				&& accountBalance == other.accountBalance
				&& (accountName==other.accountName||accountName.equals(other.accountName));
	}

	// toString
	@Override
	public String toString() {
		return "Account Name: " + accountName
				+ ", Account Number: " + accountNumber
				+ ", Account Balance: $" + accountBalance;
	}
}
