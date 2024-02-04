package assignment2;


import java.util.ArrayList;
import java.util.List;


//Name: FUYIJUN
//Student ID: 200552722
//at least 5 branches


public class Bank {
	private String bankName;
	private String branchLocation;
	// A collection of all the Accounts created (from the Account class)
	private List<Account> accounts;


	//at least 5 branches
	enum BranchLocations {

		Toronto("Toronto"),
		Barrie("Barrie"),
		Montreal("Montreal"),
		Vancouver("Vancouver"),
		Ottawa("Ottawa"),
		Calgary("Calgary");
		private String name;

		BranchLocations(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
	}


   // 1. Default constructor: Leave blank
	public Bank() {
		bankName = "initbank";
		branchLocation = BranchLocations.values()[0].name; //default array[] position
		accounts = new ArrayList<>();
	}

	//2. Constructor with 2 arguments x 2
	//o Sets the instance variables of the class
	//o Limitations of instance variables must be imposed (stated above)
	public Bank(String bankName, String branchLocation) {
		if(isValidBankName(bankName)){
			this.bankName = bankName;
		}else{
			this.bankName = "initbank";
		}
		setBranchLocation(branchLocation);
		accounts = new ArrayList<>();
	}

	public Bank(String bankName, BranchLocations branchLocation) {
		if(isValidBankName(bankName)){
			this.bankName = bankName;
		}else{
			this.bankName = "initbank";
		}

		setBranchLocation(branchLocation);
		accounts = new ArrayList<>();
	}


    //3. getBankName
	//o retrieves the name of the bank
	public String getBankName() {
		return bankName;
	}

	//4. setBankName
	//o returns a Boolean value representing whether the bank name has been updated
	//o only updates the name of the bank if it is valid

	public boolean setBankName(String bankName) {
		if (isValidBankName(bankName)) {
			this.bankName = bankName;
			return true;
		}
		return false;
	}

	//Additional method: bank name validation:
	//It’s Bank name. The bank name can only contain alphabetical characters
	//o The letters a to z (upper and lowercase) (zero or many times)
	//o The numbers 0 to 9 (between zero and three times)
	//o The ampersand (&) character (zero or may times)
	//o The space character (zero or one time)
	//o Bank name should be a minimum of 8 characters
	private boolean isValidBankName(String bankName) {
		return bankName.matches("[a-zA-Z0-9& ]{8,}");
	}


	//5. set branch location:
	//o returns a Boolean value representing whether the bank branch has been
	//updated
	//o only updates the bank branch if it is valid
	public boolean setBranchLocation(String branchLocation) {
		if (isValidBranchLocation(branchLocation)) {
			this.branchLocation = branchLocation;
			return true;
		}
		return false;
	}



	//5. set branch location * 2 : make sure user select the location
	public boolean setBranchLocation(BranchLocations branchLocation) {
		this.branchLocation = branchLocation.getName();
		return true;
	}

	//6. get branch location: returns a string representation of the branch location instance variable
	public String getBranchLocation() {
		return branchLocation.toString();
	}

   //Additional method: banklocation validation
	private boolean isValidBranchLocation(String branchLocation) {
		for (BranchLocations location : BranchLocations.values()) {
			if (location.getName().equalsIgnoreCase(branchLocation)) {
				return true;
			}
		}
		return false;
	}


	//7. get account by number:
//o searches each account in the bank collection of account.
//o returns an Account object if the account number is found in the list of Accounts
//o if the account number is not found, returns an empty object using the default constructor
	public Account getAccountByNumber(int accountNumber) {
		for (Account account: accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return new Account();  //return an empty object...
	}


    //8. add account:
	public boolean addAccount(Account account) {
		if (getAccountByNumber(account.getAccountNumber()).getAccountNumber() == 0) {
			accounts.add(account);
			return true;
		}
		return false;
	}


	//8. add acount * 2
	public boolean addAccount(String accountName, int accountNumber, double accountBalance) {
		Account account = new Account(accountName,accountNumber,accountBalance);
		if (getAccountByNumber(account.getAccountNumber()).getAccountNumber() == 0) {
			accounts.add(account);
			return true;
		}
		return false;
	}


    //9. view account(int)
    // searches bank collection of accounts and returns the account that matches the specified account number
    //o if the account number is not found, return an empty object using the default constructor
	public Account viewAccount(int accountNumber) {
		for (Account account: accounts) {
			if (account.getAccountNumber() == accountNumber) {
				return account;
			}
		}
		return new Account();
	}

	// 10. view account(byte)
    //o searches bank collection of accounts by index number (starting from zero)
    //o returns the account located at the specified index
    //o If the position is not valid, return an empty object using the default constructor
	public Account viewAccount(byte index) {
		if (index >= 0 && index < accounts.size()) {   //account.size represents the numbers of elememts in the list
			return accounts.get(index);
		}
		return new Account();
	}

	// 11. modifyAccount x 6
//o ability to change the account name and/or balance. See viewAccount to determine how searching for the account should be done.
//o Returns a Boolean value representing whether the specified account has been edited.
//▪ If BOTH account name and account balance are valid values, the Account instance variables should be modified and the boolean value of true should be returned
//▪ If EITHER account name or account balance have an invalid value, NIETHER Account instance variable should be modified and the boolean value of false should be returned

// 11. modify Account 1
	public boolean modifyAccount(int accountNumber, String accountName) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			boolean isNameUpdated = account.setAccountName(accountName);
			return isNameUpdated;
		}
		return false;
	}
	// 11. modify Account 2
	public boolean modifyAccount(int accountNumber, double accountBalance) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			boolean isBalanceUpdated = account.setAccountBalance(accountBalance);
			return isBalanceUpdated;
		}
		return false;
	}
	// 11. modify Account 3
	public boolean modifyAccount(int accountNumber, String accountName, double accountBalance) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			boolean isNameUpdated = account.setAccountName(accountName);
			boolean isBalanceUpdated = account.setAccountBalance(accountBalance);
			return isNameUpdated && isBalanceUpdated;
		}
		return false;
	}
	// 11. modify Account 4
	public boolean modifyAccount(byte index, String accountName) {
		Account account = accounts.get(index);
		if (account.getAccountNumber() != 0) {
			boolean isNameUpdated = account.setAccountName(accountName);
			return isNameUpdated;
		}
		return false;
	}
	// 11. modify Account 5
	public boolean modifyAccount(byte index, double accountBalance) {
		Account account = accounts.get(index);
		if (account.getAccountNumber() != 0) {
			boolean isBalanceUpdated = account.setAccountBalance(accountBalance);
			return isBalanceUpdated;
		}
		return false;
	}

	// 11. modify Account 6
	public boolean modifyAccount(byte index, String accountName, double accountBalance) {
		Account account = accounts.get(index);
		if (account.getAccountNumber() != 0) {
			boolean isNameUpdated = account.setAccountName(accountName);
			boolean isBalanceUpdated = account.setAccountBalance(accountBalance);
			return isNameUpdated && isBalanceUpdated;
		}
		return false;
	}


	// 12. Delete Account (int)
// o Attempts to delete the account by searching the list of accounts by accountnumber
//▪ Deletes the account if found
//o returns a boolean value representing if the account has been found & deleted.
	public boolean deleteAccount(int accountNumber) {
		Account account = getAccountByNumber(accountNumber);
		if (account.getAccountNumber() != 0) {
			accounts.remove(account);
			return true;
		}
		return false;
	}

	// 13. Delete Account (byte)
// o Attempts to delete the account by searching the list of accounts by the index number (starting from zero)
//▪ Deletes the account if found
//o returns a Boolean value representing if the account has been found & deleted.

	public boolean deleteAccount(byte index) {
		if (index >= 0 && index < accounts.size()) {
			accounts.remove(index);
			return true;
		}
		return false;
	}

}


