package patrones.disenio.creacionales.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class CZGShadePlants extends AGShadePlants {

	@Override
	Map<String, Object> getCatalogoPlantas() {
		
		if( catalogoPlantas == null || catalogoPlantas.isEmpty() ) {  
			catalogoPlantas = new HashMap<String, Object>();
			
			catalogoPlantas.put("begonia","Begonia");
			catalogoPlantas.put("agapanthus","Agapanthus");
			catalogoPlantas.put("gardenia","Gardenia");
		}

		return catalogoPlantas;
	}

	@Override
	String configuratorFountain() {
		if( fountain == null )
			fountain = "fuente con capacidad de 100 litros de agua tibia (Para plantas de sombra de clima frío)";
		
		return fountain;
	}

	@Override
	void configurationGardenSunPlants() {
		System.out.println("Descripción del jardin: \n Clima -> frío \n Tipo de plantas -> Plantas de sombra \n Catálogo de plantas -> " + this.catalogoPlantas + " \n Fuente -> " + this.fountain);		
	}	
}
