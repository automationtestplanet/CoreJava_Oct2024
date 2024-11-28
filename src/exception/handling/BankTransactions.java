package exception.handling;

public class BankTransactions {

	static int balance = 100000;

	void deposit(String accountType, int depositAmount) throws Exception{

		switch (accountType) {
		case "SAVINGS":
			if (depositAmount <= 200000) {
				BankTransactions.balance += depositAmount;
			} else {
				throw new TransactionError("Deposit Limit for SAVINGS account 200000");
			}
			break;
		case "CURRENT":
			if (depositAmount <= 500000) {
				BankTransactions.balance += depositAmount;
			} else {
				throw new TransactionError("Deposit Limit for CURRENT account 500000");
			}
			break;
		case "RETAIL":
			if (depositAmount <= 1000000) {
				BankTransactions.balance += depositAmount;
			} else {
				throw new TransactionError("Deposit Limit for RETAIL account 1000000");
			}
		default:
			throw new TransactionError("Select valid account type");
		}
	}

	void withdrawl(String accountType, int withDrawlAmount) throws Exception{
		switch (accountType) {
		case "SAVINGS":
			if (withDrawlAmount <= 50000) {
				if (withDrawlAmount <= BankTransactions.balance) {
					BankTransactions.balance -= withDrawlAmount;
				} else {
					throw new TransactionError("Isufficent Balance and Balance amount: " + BankTransactions.balance);
					
				}
			} else {
				throw new TransactionError("Withdrawl limit for SAVINGS account is 50000 or lesser");				
			}
			break;
		case "CURRENT":
			if (withDrawlAmount <= 200000) {
				if (withDrawlAmount <= BankTransactions.balance) {
					BankTransactions.balance -= withDrawlAmount;
				} else {
					throw new TransactionError("Isufficent Balance and Balance amount: " + BankTransactions.balance);
					
				}
			} else {
				throw new TransactionError("Withdrawl limit for CURRENT account is 200000 or lesser");
			}
			break;
		case "RETAIL":
			if (withDrawlAmount <= 500000) {
				if (withDrawlAmount <= BankTransactions.balance) {
					BankTransactions.balance -= withDrawlAmount;
				} else {
					throw new TransactionError("Isufficent Balance and Balance amount: " + BankTransactions.balance);
				}
			} else {
				throw new TransactionError("Withdrawl limit for RETAIL account is 500000 or lesser");
			}
			break;
		default:
			throw new TransactionError("Select valid account type");
		}
	}

	void dispalyBalance() {
		System.out.println("Avaialble Balance: " + BankTransactions.balance);
	}
}
