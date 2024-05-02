package ArraysProgram;

public class Employee{

static String ORGANIZATION_NAME = "WIPRO";

		int eid;
		String name;
		String email;
		double salary ;


		public Employee() {
			System.out.println("Default constructor");
		}

		public Employee(int id, String name, String email, double sal) {
			System.out.println(" parameterized constructor");
			eid=id;
			this.name=name;
			this.email=email;
			salary=sal;
			

		}

		public void displayEmployeeData() {
			System.out.println("employee id: " + eid);
			System.out.println("employee name: " + name);
			System.out.println("employee email: " + email);
			System.out.println("employee salary: " + salary);

		}

		public static void main(String[] args) {

			Employee e1 = new Employee();
			e1.eid = 2000;
			e1.name = "bhargav";
			e1.email = "bhargav@gmai.com";
			e1.salary = 43000.00;
			e1.displayEmployeeData();

			Employee e2 = new Employee(2001, "hari", "hari@gmail.com", 43000.00);
			e2.displayEmployeeData();
			Employee e3 = new Employee(2002, "Gunna", "Gunna@gmail.com", 33000.00);
			e3.displayEmployeeData();
			Employee e4= new Employee(2003,"tommy","tommy@gmail.com",43000.00);
			e4.displayEmployeeData();
			Employee e5=new Employee(2004,"rajesh","rajesh@gmail.com,",36000.00);
			e5.displayEmployeeData();
			Employee e6=new Employee(2006,"sakumar","saikumar@gmail.com",100000.00);
			e6.displayEmployeeData();
			Employee e7=new Employee(2007,"chiru","chiru@gmail.com",20000.00);
			e7.displayEmployeeData();
			Employee e8=new Employee(2008,"charan","charan@gmail.com",30000.00);
			e8.displayEmployeeData();
			Employee e9=new Employee(2009,"jagadeesh","jagadeesh@gmail.com",30000.00);
			e9.displayEmployeeData();
			Employee e10=new Employee(2010,"mohan","mohan@gmail.com",40000.00);
			e10.displayEmployeeData();


		}

	}

