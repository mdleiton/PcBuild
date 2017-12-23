package emsamablajecomputadoras.creacional;

public class TestIntermedioAZB extends AbstractTest {

	TestIntermedioAZB(ComputadorBuilder compu){
		this.compu=compu;
	}
	
	@Override
	public boolean valido() {
		if (this.compu.getComputadora().getModelo() =="Zenbook" && this.compu.getComputadora().getAlmacenamiento()==500) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
