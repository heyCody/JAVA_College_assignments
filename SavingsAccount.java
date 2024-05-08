public class SavingsAccount implements Account {
	double balance;
	SavingsAccount(double b){
		balance=b;
	}

	@Override
	public void deposite(double amt) {
		balance+=amt;
		System.out.println("Available balance: "+ balance);
	}

	@Override
	public void withdraw(double amt) {
		if (balance>1000) {
			balance-=amt;
		}
		else {
			System.out.println("Not sufficient amount");
		}
		System.out.println("Available balance: "+ balance);
	}

	@Override
	public void calculate_interest() {
		double i=(balance*0.3);
		balance+=i;
				
		System.out.println("Available balance: "+ balance);
	}

	@Override
	public void view_balance() {
		System.out.println("Available balance: "+ balance);
		
	}
}
