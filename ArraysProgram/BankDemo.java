package ArraysProgram;

public class BankDemo {


	static String Bankname = "SBI";
	String name;
	long Acnumber;
	double Acbalance;
	
	public BankDemo(String name,long acnumber,double acbalance){
       this.name=name;
       Acnumber=acnumber;
       Acbalance=acbalance;
	}	
				public void bankdetails() {
				System.out.println("customername: " + name);
				System.out.println("AcNumber: " + Acnumber);
                System.out.println("AcBlanace:"+Acbalance);

			}

			public static void main(String[] args) {

			BankDemo b1=new BankDemo("Bhargav",345209L,15000.00); 
			b1.bankdetails();
			BankDemo b2=new BankDemo("hari",45208L,15098.00); 
			b2.bankdetails();
			BankDemo b3=new BankDemo("sai",48708L,15098.98); 
			b3.bankdetails();
			BankDemo b4=new BankDemo("gunna",48708L,15098.98); 
			b4.bankdetails();
			BankDemo b5=new BankDemo("rajesh",98708L,15098.98);
			b5.bankdetails();
			BankDemo b6=new BankDemo("satish",987998L,150665.65);
			b6.bankdetails();
			BankDemo b7=new BankDemo("shaker",988098L,150665.65);
			b7.bankdetails();
			BankDemo b8 = new BankDemo("raju", 987998L, 150665.65);
			b8.bankdetails();
			BankDemo b9 = new BankDemo("jagadeesh", 987998L, 150665.65);
			b9.bankdetails();
			BankDemo b10 = new BankDemo("charan", 987998L, 150665.65);
			b10.bankdetails();

		}
			

			

		}



