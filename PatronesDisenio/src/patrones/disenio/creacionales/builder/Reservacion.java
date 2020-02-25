package patrones.disenio.creacionales.builder;

import java.time.LocalDate;
import java.util.Map;

public class Reservacion {
	private LocalDate date;
	private String name;
	private int numPeople;
	private int numDays;
	private double totalAmount;
	private Map<String, Object> promociones;
	
	
	public Reservacion(LocalDate date, String name, int numPeople, int numDays) {
		this.date = date;
		this.name = name;
		this.numPeople = numPeople;
		this.numDays = numDays;
	}
	
	
	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNumPeople() {
		return numPeople;
	}


	public void setNumPeople(int numPeople) {
		this.numPeople = numPeople;
	}


	public int getNumDays() {
		return numDays;
	}


	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public Map<String, Object> getPromociones() {
		return promociones;
	}


	public void setPromociones(Map<String, Object> promociones) {
		this.promociones = promociones;
	}
	
}
