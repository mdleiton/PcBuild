package emsamablajecomputadoras.creacional;

public class TestIntermedioAZB extends AbstractTest {

	TestIntermedioAZB(String n){
		this.nivel=n;
	}
	
	@Override
	public boolean valido() {
		if (this.compu.getModelo() =="Zenbook" && this.compu.getAlmacenamiento()==500) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
