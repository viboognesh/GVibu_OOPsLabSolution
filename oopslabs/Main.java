package gl.oopslabs;

public class Main {

	public static void main(String[] args) {
		Employee employee = EmailGenerator.Run();
		CredentialService cservice = new CredentialService(employee);
		cservice.showCredentials();


	}

}
