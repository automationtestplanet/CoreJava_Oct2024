package fundamentals;

public class BankTrasactions {

	static int balance = 100000;

	void deposit(int depositAmount) {
		BankTrasactions.balance += depositAmount;
	}

	void withdrawl(int withDrawlAmount) {
		BankTrasactions.balance -= withDrawlAmount;
	}

	void dispalyBalance() {
		System.out.println("Avaialble Balance: " + BankTrasactions.balance);
	}

	public static void main(String[] args) {
		BankTrasactions srNagarBranch = new BankTrasactions();
		srNagarBranch.dispalyBalance();
		srNagarBranch.deposit(50000);
		srNagarBranch.dispalyBalance();

		BankTrasactions madhapurBranch = new BankTrasactions();
		madhapurBranch.withdrawl(20000);
		madhapurBranch.dispalyBalance();

	}

}
