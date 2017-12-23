package emsamablajecomputadoras.creacional;

public class TestIntermedioAR extends AbstractTest{

	TestIntermedioAR( String n){
		this.nivel=n;
	}
	
	@Override
	public boolean valido() {
		if (this.compu.getModelo() =="ROG" && this.compu.getAlmacenamiento()==1000) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
