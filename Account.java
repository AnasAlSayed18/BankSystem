
public class Account {
		static int ID=1001;
		String Name;
		long PhoneNumber;
		char type;
		double balance;
		
		Account(){
			this.ID=1001;
			this.Name="ahmad";
			this.PhoneNumber=970592861883l;
			this.type='s';
			this.balance=67000;
		}
		Account(String n,long p,char t,double b){
			this.Name=n;
			this.PhoneNumber=p;
			this.type=t;
			this.balance=b;
		}
		
		public String toString() {
			return "Account [ID=" + ID + ", Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", type=" + type
					+ ", balance=" + balance + "]";
		}
		

	}


