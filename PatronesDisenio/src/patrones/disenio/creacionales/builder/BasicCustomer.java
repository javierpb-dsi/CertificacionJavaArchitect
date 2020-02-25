package patrones.disenio.creacionales.builder;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Cliente básico.
 * @author Javier
 *
 */
public class BasicCustomer extends ABCustomer {

	protected BasicCustomer(LocalDate date, String name, int numPeople, int numDays) {
		
		this.reservacion = new Reservacion(date, name, numPeople, numDays);
		
	}

	@Override
	void createReservation() {
		if( this.reservacion.getDate().getMonthValue() == 3 || this.reservacion.getDate().getMonthValue() == 6 || this.reservacion.getDate().getMonthValue() ==12 ) {
			this.reservacion.getPromociones().clear();
		}else {
			this.reservacion.setPromociones(new HashMap<String, Object>());
			
			this.reservacion.getPromociones().put("breakfast", "promotion include breakfast");
		}

		this.reservacion.setTotalAmount(this.reservacion.getNumPeople() * this.reservacion.getNumDays() * this.TARIFA_POR_PERSONA_POR_NOCHE_BC);
		
	}

	@Override
	void printTicket() {
		System.out.println("imprimiendo detalle de la reservación: \n");
		System.out.println("Fecha de reservacion: " + this.reservacion.getDate());
		System.out.println("Reservación a nombre de: " + this.reservacion.getName());
		System.out.println("Número de personas: " + this.reservacion.getNumPeople());
		System.out.println("Número de días: " + this.reservacion.getNumDays());
		System.out.println("Promociones: \n");
		if( this.reservacion.getPromociones() != null && this.reservacion.getPromociones().get("breakfast") != null ){
			System.out.println("Desayunos incluidos");
		}
		System.out.println("\n\n");
		System.out.println("Tipo de cliente: Cliente básico.");	
	}
}
