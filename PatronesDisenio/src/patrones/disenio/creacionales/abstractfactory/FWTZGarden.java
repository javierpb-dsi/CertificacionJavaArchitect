package patrones.disenio.creacionales.abstractfactory;

public class FWTZGarden extends AFGarden {

	@Override
	AGSunPlants configuratorSunGarden() {
		// TODO Auto-generated method stub
		WTZGSunPlants wTZGSunPlants = new WTZGSunPlants();
		wTZGSunPlants.getCatalogoPlantas();
		wTZGSunPlants.configuratorFountain();
		
		return wTZGSunPlants;
	}

	@Override
	AGShadePlants configuratorShadeGarden() {
		// TODO Auto-generated method stub
		WTZGShadePlants wTZGShadePlants = new WTZGShadePlants();
		wTZGShadePlants.getCatalogoPlantas();
		wTZGShadePlants.configuratorFountain();
		
		return wTZGShadePlants;
	}

}
