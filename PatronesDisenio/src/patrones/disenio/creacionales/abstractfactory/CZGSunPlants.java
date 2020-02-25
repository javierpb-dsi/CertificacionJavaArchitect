package patrones.disenio.creacionales.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public class CZGSunPlants extends AGSunPlants {

	@Override
	Map<String, Object> getCatalogoPlantas() {
		
		if( catalogoPlantas == null || catalogoPlantas.isEmpty() ) {  
			catalogoPlantas = new HashMap<String, Object>();
			
			catalogoPlantas.put("rhondendro","Rhondendro");
			catalogoPlantas.put("daffodil","Daffodil");
		}

		return catalogoPlantas;
	}

	@Override
	String configuratorFountain() {
		if( fountain == null )
			fountain = "fuente con capacidad de 150 litros de agua al tiempo (Para plantas de sol de clima frío)";
		
		return fountain;
	}

	@Override
	void configurationGardenSunPlants() {
		System.out.println("Descripción del jardin: \n Clima -> frío \n Tipo de plantas -> Plantas de sol \n Catálogo de plantas -> " + this.catalogoPlantas + " \n Fuente -> " + this.fountain);		
	}



}
