package patrones.disenio.creacionales.prototype;

public abstract class  PrototypeFactory implements Cloneable {
	protected int id;
	protected int[][] location;
	protected int productionTime;
	protected int averageFailureTime;
	
	protected abstract Object clone();
	protected abstract void printerBasicAttr();
}
