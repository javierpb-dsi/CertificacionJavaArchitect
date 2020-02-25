package patrones.disenio.creacionales.prototype;

public class MixerTypeMachine extends PrototypeFactory {
	private int mixer1;
	private int mixer2;
	
	public MixerTypeMachine(int id, int[][] location, int productionTime, int mixer1, int mixer2) {
		this.id = id;
		this.location = location;
		this.productionTime = productionTime;
		this.averageFailureTime = 80;
		this.mixer1 = mixer1;
		this.mixer2 = mixer2;
	}
	
	@Override
	protected MixerTypeMachine clone() {
		return new MixerTypeMachine(this.id, this.location, this.productionTime, this.mixer1, this.mixer2);
	}

	public void mixerValidator() {
		int mixingSum = this.mixer1 + this.mixer2; 
		
		if( mixingSum == 100 ) {
			System.out.println("The mixing sum: OK");
		}else {
			System.out.println("The mixing sum: ERROR");
		}
	}
	
	@Override
	protected void printerBasicAttr() {
		System.out.println("this.id: " + this.id + "\t this.location: " + this.location + "\t this.productionTime: " + this.productionTime + "\t this.averageFailureTime: " + this.averageFailureTime + "\t this.mixer1: " + this.mixer1 + "\t this.mixer2: " + this.mixer2);
		mixerValidator();
	}

}
