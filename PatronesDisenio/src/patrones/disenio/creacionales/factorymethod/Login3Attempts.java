package patrones.disenio.creacionales.factorymethod;

public class Login3Attempts implements ILogin {
	private final int MAX_ATTEMPTS = 3;
	private int attempts = 0;
	private String user = "Javier";
	private String password = "javier";
	
	@Override
	public void validarLogin(String user, String password) {
		if( this.user.equals(user) && this.password.equals(password) ) {
			System.out.println("Login3Attempts: Autenticación exitosa.");
		}else {
			attempts++;
			System.out.println("Login3Attempts: Datos incorrectos, autenticación incorrecta. (" + this.attempts + " de " + this.MAX_ATTEMPTS + " intentos)");
		}
	}

}
