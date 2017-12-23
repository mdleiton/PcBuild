package emsamablajecomputadoras.creacional;

public class TestIniciaAR extends AbstractTest {

	TestIniciaAR( String n){
		this.nivel=n;
	}
	
	@Override
	public void escribirMensaje(String mensaje) {
		System.out.println(mensaje);

	}

	@Override
	public boolean valido() {
		SistemaOperativo so=new SistemaOperativo("Windows",64," 10 PRO");
		if (this.compu.getMarca() =="Asus" && this.compu.getOs().equals(so)) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
