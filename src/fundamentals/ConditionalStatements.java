package fundamentals;

public class ConditionalStatements {

	static int balance = 100000;

	void deposit(String accountType, int depositAmount) {

		switch (accountType) {
		case "SAVINGS":
			if (depositAmount <= 200000) {
				BankTrasactions.balance += depositAmount;
			} else {
				System.out.println("Deposit Limit for SAVINGS account 200000");
			}
			break;
		case "CURRENT":
			if (depositAmount <= 500000) {
				BankTrasactions.balance += depositAmount;
			} else {
				System.out.println("Deposit Limit for CURRENT account 500000");
			}
			break;
		case "RETAIL":
			if (depositAmount <= 1000000) {
				BankTrasactions.balance += depositAmount;
			} else {
				System.out.println("Deposit Limit for RETAIL account 1000000");
			}
		default:
			System.out.println("Select valid account type");
		}
	}

	void withdrawl(String accountType, int withDrawlAmount) {
		switch (accountType) {
		case "SAVINGS":
			if (withDrawlAmount <= 50000) {
				if (withDrawlAmount <= BankTrasactions.balance) {
					BankTrasactions.balance -= withDrawlAmount;
				} else {
					System.out.println("Isufficent Balance and Balance amount: " + BankTrasactions.balance);
				}
			} else {
				System.out.println("Withdrawl limit for SAVINGS account is 50000 or lesser");
			}
			break;
		case "CURRENT":
			if (withDrawlAmount <= 200000) {
				if (withDrawlAmount <= BankTrasactions.balance) {
					BankTrasactions.balance -= withDrawlAmount;
				} else {
					System.out.println("Isufficent Balance and Balance amount: " + BankTrasactions.balance);
				}
			} else {
				System.out.println("Withdrawl limit for CURRENT account is 200000 or lesser");
			}
			break;
		case "RETAIL":
			if (withDrawlAmount <= 500000) {
				if (withDrawlAmount <= BankTrasactions.balance) {
					BankTrasactions.balance -= withDrawlAmount;
				} else {
					System.out.println("Isufficent Balance and Balance amount: " + BankTrasactions.balance);
				}
			} else {
				System.out.println("Withdrawl limit for RETAIL account is 500000 or lesser");
			}
			break;
		default:
			System.out.println("Select valid account type");
			break;
		}
	}

	void dispalyBalance() {
		System.out.println("Avaialble Balance: " + BankTrasactions.balance);
	}

	public static void main(String[] args) {

		ConditionalStatements srNagarBranch = new ConditionalStatements();
		srNagarBranch.dispalyBalance();
		srNagarBranch.deposit("SAVINGS", 50000);
		srNagarBranch.dispalyBalance();

		ConditionalStatements madhapurBranch = new ConditionalStatements();
		madhapurBranch.withdrawl("SAVINGS", 20000);

		madhapurBranch.dispalyBalance();

		madhapurBranch.withdrawl("SAVINGS", 60000);

		madhapurBranch.deposit("SAVINGS", 300000);

	}
}
