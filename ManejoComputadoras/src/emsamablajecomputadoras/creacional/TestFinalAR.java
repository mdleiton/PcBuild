package emsamablajecomputadoras.creacional;

public class TestFinalAR extends AbstractTest {
	
	TestFinalAR( String n){
		this.nivel=n;
	}
	
	@Override
	public boolean valido() {
		Mainboard mb=new Mainboard("Strix"," x99");
		if (this.compu.getRam() ==32 && this.compu.getPlaca().equals(mb)) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
