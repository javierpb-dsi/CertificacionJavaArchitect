package patrones.disenio.creacionales.singleton;

public class Login {
	private static Login login = null;
	private final String USER = "Javier";
	private final String PASSWORD = "javier";
	private String user;
	private String password;
	
	private Login() {
		
	}
	
	private synchronized static void createinstance() {
		if( login == null ) {
			login = new Login();
		}
	}
	
	public static Login getInstance() {
		if( login == null ) {
			createinstance();
		}
		
		return login;
	}
	
	public boolean validateUser(String user, String password) {
		if( this.USER.equals(user) && this.PASSWORD.equals(password) ) {
			System.out.println("Autenticación exitosa. ("+this.login+")");
			return Boolean.TRUE;
		}else {
			
			System.out.println("Error en los datos de autenticación, verifique sus datos y vuelva a intentar. (" + this.login + ")");
			return Boolean.FALSE;
		}
	}
}
