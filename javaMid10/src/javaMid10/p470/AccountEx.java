package javaMid10.p470;

public class AccountEx {

	public static void main(String[] args) {
		Account account=new Account();
		account.deposit(10000);
		System.out.println("잔금: "+account.getBalance());
		try {
			int money=5000;
			account.withdraw(money);	
			System.out.println("현재출금금액"+money);
		}catch(InsufficientException e) {
			String message=e.getMessage();
			System.out.println(message);
		}
		
		
	}

}
