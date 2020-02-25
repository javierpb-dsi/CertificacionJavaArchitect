package patrones.disenio.creacionales.abstractfactory;

public class Agencia {
	
	public static void main(String[] args) {
		
		FWTZGarden fWTZGarden = new FWTZGarden();
		AGShadePlants wtzgShadePlants = fWTZGarden.configuratorShadeGarden();
		wtzgShadePlants.configurationGardenSunPlants();
		System.out.println("==========================================================================");
		AGSunPlants wtzgSunPlants = fWTZGarden.configuratorSunGarden();
		wtzgSunPlants.configurationGardenSunPlants();
		System.out.println("==========================================================================");
		
		FCZGarden fCZGarden = new FCZGarden();
		AGShadePlants aGShadePlants = fCZGarden.configuratorShadeGarden();
		aGShadePlants.configurationGardenSunPlants();
		System.out.println("==========================================================================");
		AGSunPlants aGSunPlants = fCZGarden.configuratorSunGarden();
		aGSunPlants.configurationGardenSunPlants();
		System.out.println("==========================================================================");
	}
}
