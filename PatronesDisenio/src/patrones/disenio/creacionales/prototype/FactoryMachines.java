package patrones.disenio.creacionales.prototype;

public class FactoryMachines {
	private FusorTypeMachine fusorTypeMachine; 
	private MixerTypeMachine mixerTypeMachine; 
	
	
	public FactoryMachines() {
		int[][] coordinatesFTM = {{0, 1}};
		this.fusorTypeMachine = new FusorTypeMachine(1, coordinatesFTM, 10000, 5);
		
		int[][] coordinatesMTM = {{1, 0}};
		this.mixerTypeMachine = new MixerTypeMachine(2, coordinatesMTM, 15000, 69, 31);
	}
	
	public FusorTypeMachine createFusorTypeMachine() {
		return (this.fusorTypeMachine == null) ? null : this.fusorTypeMachine.clone();
	}
	
	public MixerTypeMachine createMixerTypeMachine() {
		return (this.mixerTypeMachine == null) ? null : this.mixerTypeMachine.clone();
	}
	
}
