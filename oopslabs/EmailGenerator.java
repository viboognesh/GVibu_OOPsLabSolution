package gl.oopslabs;

import java.util.Scanner;

public class EmailGenerator 
{
	public static Employee Run() 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("*************************");
		System.out.println("Welcome to EmailGenerator");
		System.out.println("*************************");
		System.out.println();
		
		System.out.println("Enter your first name:");
		String firstName = sc.next();
		
		System.out.println("Enter your last name:");
		String lastName = sc.next();
		
		String department = null;
		
		while(department == null) {
			System.out.println("Select your department:");
			System.out.println("1.Technical");
			System.out.println("2.Admin");
			System.out.println("3.Human Resources");
			System.out.println("4.Legal");
			System.out.println("Select 1 or 2 or 3 or 4");
			
			int inp = sc.nextInt();
					
			switch(inp) {
				case 1:
					department = "Technical"; break;
				case 2:
					department = "Admin"; break;
				case 3:
					department = "Human Resources"; break;
				case 4:
					department = "Legal"; break;
				default:
					System.out.println("Please select only 1 or 2 or 3 or 4");
			}
		}
		
		sc.close();
		
		Employee employee = new Employee(firstName, lastName, department);
		return employee;
				
	}

	
}
