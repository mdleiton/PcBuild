package emsamablajecomputadoras.creacional;

public abstract class AbstractTest {

	public String informacion="1";
	public String nivel;
	public String error="3";
	public AbstractTest siguienteTest;
	public Computador compu;
	
	public void setSiguienteTest(AbstractTest siguiente) {
		this.siguienteTest=siguiente;
	}
	
	public void setComputador(Computador compu) {
		this.compu=compu;
	}
	
	
	public void escribirMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public abstract boolean valido();
	
}
