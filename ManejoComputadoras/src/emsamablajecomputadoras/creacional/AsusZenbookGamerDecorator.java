package emsamablajecomputadoras.creacional;

public class AsusZenbookGamerDecorator extends PCDecorator {
	int ram;
	public AsusZenbookGamerDecorator(IComputador pc) {
		super(pc);
		ram = 16;
	}
	
	public String especificacionesTecnicas(){
        return super.especificacionesTecnicas()+ "Ram adicional: "+this.ram+"\n";
	}
	
}
