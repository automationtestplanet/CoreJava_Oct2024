package exception.handling;

public class UseBankTransactions {

	public static void main(String[] args) throws Exception{
		BankTransactions sbiBank = new BankTransactions();
		
		try {
		sbiBank.withdrawl("SAVINGS", 105000);		
		sbiBank.withdrawl("SAVINGS", 5000);
		sbiBank.dispalyBalance();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
