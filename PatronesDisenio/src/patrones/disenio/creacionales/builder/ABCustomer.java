package patrones.disenio.creacionales.builder;

import java.time.LocalDate;
import java.util.Date;
import java.util.Map;

public abstract class ABCustomer {
	protected final int TARIFA_POR_PERSONA_POR_NOCHE_BC = 500;
	protected final int TARIFA_POR_PERSONA_POR_NOCHE_PC = 400;
	protected final int TARIFA_POR_PERSONA_POR_NOCHE_FC = 400;
	
	protected Reservacion reservacion; 
	
	abstract void createReservation();
	abstract void printTicket();
}
