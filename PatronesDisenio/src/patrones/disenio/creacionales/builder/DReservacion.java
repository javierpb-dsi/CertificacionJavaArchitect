package patrones.disenio.creacionales.builder;

public class DReservacion {
	private ABCustomer builderCustomer;
	
	public void setBuilderCustomer(ABCustomer builderCustomer) {
		this.builderCustomer = builderCustomer;
	}
	
	public Reservacion generarReservacion() {
		this.builderCustomer.createReservation();
		
		return this.builderCustomer.reservacion;
	}
	
	
	public void imprimirReservacion() {
		this.builderCustomer.printTicket();
	}
	
}
