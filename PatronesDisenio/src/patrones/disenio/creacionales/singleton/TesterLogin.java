package patrones.disenio.creacionales.singleton;

public class TesterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login login = Login.getInstance();
		login.validateUser("Nestor", "123");
		System.out.println("======================================================================================================================================================");
		login = Login.getInstance();
		login.validateUser("Javier", "javier");
		
	}

}
