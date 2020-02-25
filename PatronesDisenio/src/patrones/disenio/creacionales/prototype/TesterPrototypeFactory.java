package patrones.disenio.creacionales.prototype;

public class TesterPrototypeFactory {

	public static void main(String[] args) {
		FactoryMachines fm = new FactoryMachines();
		
		PrototypeFactory pff = fm.createFusorTypeMachine();
		pff.printerBasicAttr();
		System.out.println("==========================================================================================================================================================================");
		PrototypeFactory pmf = fm.createMixerTypeMachine();
		pmf.printerBasicAttr();
	}
}
