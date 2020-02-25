package patrones.disenio.creacionales.abstractfactory;

import java.util.Map;

public abstract class AGShadePlants {
	protected Map<String, Object> catalogoPlantas;
	protected String fountain;
	
	abstract Map<String, Object> getCatalogoPlantas();
	abstract String configuratorFountain();
	abstract void configurationGardenSunPlants();
}
