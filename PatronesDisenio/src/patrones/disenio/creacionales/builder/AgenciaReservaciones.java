package patrones.disenio.creacionales.builder;

import java.time.LocalDate;

public class AgenciaReservaciones {
	
	public void reservaciones() {
		
		BasicCustomer bc = new BasicCustomer(LocalDate.now(), "Javier P.", 2, 5);
		DReservacion dReservaciones = new DReservacion();
		
		dReservaciones.setBuilderCustomer(bc);
		Reservacion reservacion = dReservaciones.generarReservacion();
		dReservaciones.imprimirReservacion();
	}
	
	public static void main(String[] args) {
		AgenciaReservaciones agenciaReservaciones = new AgenciaReservaciones();
		
		agenciaReservaciones.reservaciones();
	}
}
