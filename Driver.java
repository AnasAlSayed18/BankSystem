import java.util.Scanner;
public class Driver {
static Scanner input=new Scanner(System.in);

	public static void main(String[] args) {
		
	 Bank obj=new Bank();
		int num=0;
		while(num!=8) {
		displayMainMenu();
		 num=input.nextInt();
		 switch (num) {
		 case 1:addaccount();
		 break;
		 case 2:obj.viewall();
		 }
		}
		System.out.println("Thank you for choosing our ABC Bank \nGood bye :) ");
	}
	public static void displayMainMenu() {
		System.out.println("Please Select an Operation (1-8)");
		System.out.println("1- Add Account");
		System.out.println("2- View All Accounts");
		System.out.println("3- Add Amount");
		System.out.println("4- Withdraw Amount");
		System.out.println("5- View Account Details");
		System.out.println("6- Modify Account");
		System.out.println("7- Close an Account");
		System.out.println("8- Exit");

	}
	public static void addaccount() {
		
		System.out.print("Enter the name : ");
		String n=input.next();
		System.out.print("Enter the phone number: ");
		long p=input.nextLong();
		System.out.print("Enter account type(s:saving,o:other) : ");
		char t=input.next().charAt(0);
		double balance=0;
		
		Bank b1=new Bank();
		 Account obj1 = new Account(n, p, t,balance);
		 b1.addAccount(obj1);
	}
	
}
