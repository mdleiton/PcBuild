package emsamablajecomputadoras.creacional;

public class TestFinalAZB extends AbstractTest{
	TestFinalAZB(ComputadorBuilder compu){
		this.compu=compu;
	}
	
	@Override
	public boolean valido() {
		Mainboard mb=new Mainboard("Prime","Z370");
		if (this.compu.getComputadora().getRam() ==16 && this.compu.getComputadora().getPlaca().equals(mb)) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
