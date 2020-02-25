package patrones.disenio.creacionales.factorymethod;

import java.time.LocalDateTime;

public class LoginTimer implements ILogin {
	private int WAIT_MINUTS = 5;
	private String user = "Javier";
	private String password = "javier";
	private LocalDateTime date;
	
	@Override
	public void validarLogin(String user, String password) {
		if( date == null || (date != null && date.plusMinutes(this.WAIT_MINUTS).isBefore(LocalDateTime.now()) )) {
			if( this.user.equals(user) && this.password.equals(password) ) {
				System.out.println("LoginTimer: Autenticación exitosa.");
			}else {
				date = LocalDateTime.now();
				System.out.println("LoginTimer: Datos incorrectos, autenticación incorrecta. (Vuelva a intentar en " + this.WAIT_MINUTS + " minutos)");
			}			
		}else {
			System.out.println("LoginTimer: Intente más tarde.");
		}
		

	}

}
