package emsamablajecomputadoras.creacional;

public class TestFinalAZB extends AbstractTest{
	TestFinalAZB(String n){
		this.nivel=n;
	}
	
	@Override
	public boolean valido() {
		Mainboard mb=new Mainboard("Prime","Z370");
		if (this.compu.getRam() ==16 && this.compu.getPlaca().equals(mb)) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
