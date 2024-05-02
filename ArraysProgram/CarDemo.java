package ArraysProgram;
public class CarDemo {
	static String Car="BMW";
	String name;
	String colour;
	long cost;
	public CarDemo(String name,String colour,long cost) {
		this.name=name;
		this.colour=colour;
		this.cost=cost;
	}
			public void cardetails() {
				System.out.println("customer name:"+name);
				System.out.println("customer car colour:"+colour);	
				System.out.println("customer car cost:"+cost);
			}
			public static void main(String[] args) {
				CarDemo c1=new CarDemo("bhargv","red",894899L);
                   c1.cardetails();
                   System.out.println("---------------------------");
   				CarDemo c2=new CarDemo("hari","black",984899L);
                     c2.cardetails();
                     System.out.println("---------------------------");
        		CarDemo c3=new CarDemo("gunna","red",994899L);
        						c3.cardetails();
        		     System.out.println("---------------------------");
        		CarDemo c4=new CarDemo("sai","black",894999L);
        						c4.cardetails();
        		     System.out.println("---------------------------");
				CarDemo c5=new CarDemo("balu","red",764999L);
                         c5.cardetails();
                   System.out.println("---------------------------");
                CarDemo c6=new CarDemo("shakar","black",1224999L);
                        c6.cardetails();
                   System.out.println("---------------------------");
                CarDemo c7=new CarDemo("ram","red",9875999L);
                        c7.cardetails();
                   System.out.println("---------------------------");
                CarDemo c8=new CarDemo("charan","black",4324999L);
                        c8.cardetails();
                    System.out.println("---------------------------");
                CarDemo c9=new CarDemo("raju","red",564999L);
                        c9.cardetails();
                    System.out.println("---------------------------");  
                CarDemo c10=new CarDemo("satish","black",7894999L);
                        c10.cardetails();
                     System.out.println("---------------------------");

	}
}
