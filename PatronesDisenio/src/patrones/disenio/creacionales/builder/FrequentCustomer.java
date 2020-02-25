package patrones.disenio.creacionales.builder;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class FrequentCustomer extends ABCustomer {

	protected FrequentCustomer(LocalDate date, String name, int numPeople, int numDays) {
		this.reservacion = new Reservacion(date, name, numPeople, numDays);
		// TODO Auto-generated constructor stub
	}

	@Override
	void createReservation() {
		if( this.reservacion.getDate().getMonthValue() == 3 || this.reservacion.getDate().getMonthValue() == 6 || this.reservacion.getDate().getMonthValue() ==12 ) {
			this.reservacion.getPromociones().clear();
		}else {
			this.reservacion.setPromociones(new HashMap<String, Object>());
			
			this.reservacion.getPromociones().put("breakfast", "promotion include breakfast");
		}
		
		this.reservacion.getPromociones().put("descuento", "20% de descuento.");
		this.reservacion.setTotalAmount(this.reservacion.getNumPeople() * this.reservacion.getNumDays() * this.TARIFA_POR_PERSONA_POR_NOCHE_FC);
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
		
		System.out.println("20 % de descuento");
		System.out.println("Monto total: " + this.reservacion.getTotalAmount());
		System.out.println("Descuento: " + (this.reservacion.getTotalAmount() * 0.20));
		System.out.println("Monto total a pagar: " + (this.reservacion.getTotalAmount() * 0.80));
		
		System.out.println("\n\n");
		System.out.println("Tipo de cliente: Cliente periodico.");
	}

}
