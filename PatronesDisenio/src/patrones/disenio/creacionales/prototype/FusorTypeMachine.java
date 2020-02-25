package patrones.disenio.creacionales.prototype;

public class FusorTypeMachine extends PrototypeFactory {
	private int delay;
	
	
	public FusorTypeMachine(int id, int[][] location, int productionTime, int delay) {
		this.id = id;
		this.location = location;
		this.productionTime = productionTime;
		this.averageFailureTime = 50;
		this.delay = delay;
	}
	
	@Override
	protected FusorTypeMachine clone() {
		return new FusorTypeMachine(this.id, this.location, this.productionTime, this.averageFailureTime);
	}

	@Override
	protected void printerBasicAttr() {
		System.out.println("id: " + id + "\t location: " + location + "\t productionTime: " + productionTime + "\t averageFailureTime: " + averageFailureTime + "\t delay: " + delay);
	}

}
