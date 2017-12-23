package emsamablajecomputadoras.creacional;

public class TestFinalAR extends AbstractTest {

	TestFinalAR(ComputadorBuilder compu){
		this.compu=compu;
	}
	
	@Override
	public boolean valido() {
		Mainboard mb=new Mainboard("Strix"," x99");
		if (this.compu.getComputadora().getRam() ==32 && this.compu.getComputadora().getPlaca().equals(mb)) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}