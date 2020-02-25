package patrones.disenio.creacionales.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class WTZGShadePlants extends AGShadePlants {

	@Override
	Map<String, Object> getCatalogoPlantas() {
		
		if( catalogoPlantas == null || catalogoPlantas.isEmpty() ) {  
			catalogoPlantas = new HashMap<String, Object>();
			
			catalogoPlantas.put("hostas","Hostas");
			catalogoPlantas.put("camelia","Camelia");
			catalogoPlantas.put("hydrangea","Hydrangea");
		}

		return catalogoPlantas;
	}

	@Override
	String configuratorFountain() {
		if( fountain == null )
			fountain = "fuente con capacidad de 200 litros de agua al tiempo (Para plantas de sombra de clima templado)";
		
		return fountain;
	}

	@Override
	void configurationGardenSunPlants() {
		System.out.println("Descripción del jardin: \n Clima -> templado \n Tipo de plantas -> Plantas de sombra \n Catálogo de plantas -> " + this.catalogoPlantas + " \n Fuente -> " + this.fountain);		
	}	
}
