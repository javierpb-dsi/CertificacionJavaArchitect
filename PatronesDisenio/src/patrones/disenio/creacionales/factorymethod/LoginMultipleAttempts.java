package patrones.disenio.creacionales.factorymethod;

public class LoginMultipleAttempts implements ILogin {
	private String user = "Javier";
	private String password = "javier";
	
	@Override
	public void validarLogin(String user, String password) {
		if( this.user.equals(user) && this.password.equals(password) ) {
			System.out.println("LoginMultipleAttempts: Autenticaci�n exitosa.");
		}else {
			System.out.println("LoginMultipleAttempts: Datos incorrectos, verif�que sus datos y vuelva a intentar.");
		}
	}

}
