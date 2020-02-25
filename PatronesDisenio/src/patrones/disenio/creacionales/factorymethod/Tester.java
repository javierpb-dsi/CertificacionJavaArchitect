package patrones.disenio.creacionales.factorymethod;

public class Tester {
	private final int OPCION_LOGIN_REFUSE = 1;
	private final int OPCION_LOGIN_3_ATTEMPTS = 2;
	private final int OPCION_LOGIN_TIMER = 3;
	private final int OPCION_LOGIN_MULTIPLE_ATTEMPTS = 4;
		
	public static void main(String[] args) {
		ValidadorLogin validadorLogin = new ValidadorEspecificoLogin();
		Tester tester = new Tester();
		
		ILogin login = validadorLogin.factoryMethod(tester.OPCION_LOGIN_REFUSE);
		login.validarLogin("Javier", "javier");
		login.validarLogin("Javier", "javierr");
		System.out.println("/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
		
		login = validadorLogin.factoryMethod(tester.OPCION_LOGIN_3_ATTEMPTS);
		login.validarLogin("Javier", "javier");
		login.validarLogin("Javier", "javierr");
		login.validarLogin("Javier", "javierrr");
		login.validarLogin("Javier", "javierrrr");
		System.out.println("/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
		
		login = validadorLogin.factoryMethod(tester.OPCION_LOGIN_TIMER);
		login.validarLogin("Javier", "javier");
		login.validarLogin("Javier", "javierr");
		login.validarLogin("Javier", "javierrr");
		System.out.println("/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
		
		login = validadorLogin.factoryMethod(tester.OPCION_LOGIN_MULTIPLE_ATTEMPTS);
		login.validarLogin("Javier", "javier");
		login.validarLogin("Javier", "javierr");
		login.validarLogin("Javier", "javierrr");
		login.validarLogin("Javier", "javierrrr");
		login.validarLogin("Javier", "javierrrrr");
		login.validarLogin("Javier", "javierrrrrr");
		System.out.println("/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_");
		
	}

}
