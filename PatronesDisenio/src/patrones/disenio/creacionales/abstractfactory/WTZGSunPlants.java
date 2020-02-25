package patrones.disenio.creacionales.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class WTZGSunPlants extends AGSunPlants {

	@Override
	Map<String, Object> getCatalogoPlantas() {
		
		if( catalogoPlantas == null || catalogoPlantas.isEmpty() ) {  
			catalogoPlantas = new HashMap<String, Object>();
			
			catalogoPlantas.put("jasmine","Jasmine");
			catalogoPlantas.put("geranium","Geranium");
			catalogoPlantas.put("petunia","Petunia");
		}

		return catalogoPlantas;
	}

	@Override
	String configuratorFountain() {
		if( fountain == null )
			fountain = "fuente con capacidad de 350 litros de agua fría (Para plantas de sol de clima templado)";
		
		return fountain;
	}

	@Override
	void configurationGardenSunPlants() {
		System.out.println("Descripción del jardin: \n Clima -> Templado \n Tipo de plantas -> Plantas de sol \n Catálogo de plantas -> " + this.catalogoPlantas + " \n Fuente -> " + this.fountain);		
	}

}
