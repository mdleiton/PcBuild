package emsamablajecomputadoras.creacional;

public abstract class AbstractTest {

	public String informacion="1";
	public String nivel="2";
	public String error="3";
	public AbstractTest siguienteTest;
	public ComputadorBuilder compu;
	
	public void setSiguienteTest(AbstractTest siguiente) {
		this.siguienteTest=siguiente;
	}
	
	public void setComputador(ComputadorBuilder compu) {
		this.compu=compu;
	}
	
	
	public void escribirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public abstract boolean valido();
	
}
