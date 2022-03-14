package gl.oopslabs;

import java.util.Random;

public class CredentialService {
	private Employee employee;
	
	private String EmailID;
	private String password;

	
	private String shortDepartmentName() {
		String department = employee.getDepartment();
		String shortName;
		
		switch (department) {
		case "Technical": shortName = "tech";
		break;
		case "Admin": shortName = "adm";
		break;
		case "Human Resource": shortName = "hr";
		break;
		case "Legal": shortName = "lgl";
		break;
		default: shortName ="";
		break;
		}
		
		return shortName;
	}
	
	public CredentialService(Employee employee) {
		this.employee = employee;
		generateEmailID();
		generatePassword();
	}
	
	private void generateEmailID() {
		String generatedEmailID = employee.getFirstName().toLowerCase() + 
				employee.getLastName().toLowerCase() + "@" + 
				shortDepartmentName() + ".gl.com";
		this.EmailID = generatedEmailID;
	}
	
	private void generatePassword() {
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String specialCharacters = "!@#$%&*()’+,-./:;<=>?[]^_`{|}";
		
		String allValues = capLetters + smallLetters + numbers + specialCharacters;
		
		String password = "";
		
		Random random = new Random();
		
		for(int i=0; i<8; i++) {
			int boundValue = allValues.length();
			int randomIndex = random.nextInt(boundValue);
			String letter = allValues.substring(randomIndex, randomIndex + 1);
			password = password.concat(letter);
		}
		
		this.password = password;
		
	}

	public String getEmailID() {
		return EmailID;
	}

	public String getPassword() {
		return password;
	}
	
	public void showCredentials() {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email    ---> "+this.EmailID);
		System.out.println("Password ---> "+this.password);
		
	}


}
