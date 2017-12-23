package emsamablajecomputadoras.creacional;

public class TestInicialAZB extends AbstractTest {

	TestInicialAZB(ComputadorBuilder compu){
		this.compu=compu;
	}
	
	@Override
	public void escribirMensaje(String mensaje) {
		System.out.println(mensaje);

	}

	@Override
	public boolean valido() {
		SistemaOperativo so=new SistemaOperativo("Windows",64," 10 Home ");
		if (this.compu.getComputadora().getMarca() =="Asus" && this.compu.getComputadora().getOs().equals(so)) {
			this.escribirMensaje("TestInicial completado con exito");
			return true;
		}
		this.escribirMensaje("TestInicial completado con error codigo error:"+this.error);
		return false;
	}

}
