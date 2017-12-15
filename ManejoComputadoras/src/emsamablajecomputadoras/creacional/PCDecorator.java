package emsamablajecomputadoras.creacional;

public class  PCDecorator implements IComputador{
	IComputador pc ;
	
	public PCDecorator(IComputador pc) {
		this.pc = pc;
	}
	
	@Override
	public String especificacionesTecnicas() {
		return this.pc.especificacionesTecnicas();
	}

}
