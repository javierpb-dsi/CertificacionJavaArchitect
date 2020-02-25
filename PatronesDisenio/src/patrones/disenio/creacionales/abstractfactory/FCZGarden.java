package patrones.disenio.creacionales.abstractfactory;

public class FCZGarden extends AFGarden {

	@Override
	AGSunPlants configuratorSunGarden() {
		// TODO Auto-generated method stub
		CZGSunPlants cZGSunPlants = new CZGSunPlants();
		cZGSunPlants.getCatalogoPlantas();
		cZGSunPlants.configuratorFountain();
		
		return cZGSunPlants;
	}

	@Override
	AGShadePlants configuratorShadeGarden() {
		// TODO Auto-generated method stub
		CZGShadePlants cZGShadePlants = new CZGShadePlants();
		cZGShadePlants.getCatalogoPlantas();
		cZGShadePlants.configuratorFountain();
		
		return cZGShadePlants;
	}

}
