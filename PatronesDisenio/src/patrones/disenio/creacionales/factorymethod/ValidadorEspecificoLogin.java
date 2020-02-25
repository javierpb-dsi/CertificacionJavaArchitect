package patrones.disenio.creacionales.factorymethod;

public class ValidadorEspecificoLogin extends ValidadorLogin {
	private final int OPCION_LOGIN_REFUSE = 1;
	private final int OPCION_LOGIN_3_ATTEMPTS = 2;
	private final int OPCION_LOGIN_TIMER = 3;
	private final int OPCION_LOGIN_MULTIPLE_ATTEMPTS = 4;
	
	
	@Override
	public ILogin factoryMethod(int opcionLogin) {
		ILogin login = null;
		
		switch(opcionLogin) {
			case OPCION_LOGIN_REFUSE:
				login = new LoginRefuse();
				break;
			case OPCION_LOGIN_3_ATTEMPTS:
				login = new Login3Attempts();
				break;
			case OPCION_LOGIN_TIMER:
				login = new LoginTimer();
				break;
			case OPCION_LOGIN_MULTIPLE_ATTEMPTS:
				login = new LoginMultipleAttempts();
				break;
			default:
				login = null;
				break;
		}
		
		return login;
	}

}
