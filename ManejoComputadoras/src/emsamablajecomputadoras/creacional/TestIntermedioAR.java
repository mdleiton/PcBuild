package emsamablajecomputadoras.creacional;

public class TestIntermedioAR extends AbstractTest{

	TestIntermedioAR(ComputadorBuilder compu){
		this.compu=compu;
	}
	
	@Override
	public boolean valido() {
		if (this.compu.getComputadora().getModelo() =="ROG" && this.compu.getComputadora().getAlmacenamiento()==1000) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
