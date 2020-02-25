package patrones.disenio.creacionales.factorymethod;

public class LoginRefuse implements ILogin {
	private String user = "Javier";
	private String password = "javier";

	@Override
	public void validarLogin(String user, String password) {
		if( this.user.equals(user) && this.password.equals(password) ) {
			System.out.println("LoginRefuse: Autenticación exitosa.");
		}else {
			System.out.println("LoginRefuse: Datos incorrectos, autenticación incorrecta.");
		}
	}

}
