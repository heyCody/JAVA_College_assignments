import java.util.*;
public class Bank_Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		double balance=sc.nextDouble();
		SavingsAccount sa=new SavingsAccount(balance);
		CurrentAccount ca=new CurrentAccount(balance);
		sa.deposite(1000);
		sa.withdraw(700);
		sa.view_balance();
		
		ca.withdraw(1000);
		ca.view_balance();
		ca.calculate_interest();
		

	}

}
