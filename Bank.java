
public class Bank {
	static int arrlenght=0;
	Account arr[]=new Account[5];
	static int ID=1001;
	String Name;
	long PhoneNumber;
	char type;
	double balance;
	
	public void addAccount(Account A){
		arr[arrlenght]= A;
		this.ID++;
		arrlenght+=1;
	}
	public void viewall() {
		System.out.println("Avaliable accounts are: ");
		for(int i=0;i<arrlenght;i++) {
			System.out.println("ID= "+arr[i].ID +",His name is: "+arr[i].Name);
		}
	}

		

	}


