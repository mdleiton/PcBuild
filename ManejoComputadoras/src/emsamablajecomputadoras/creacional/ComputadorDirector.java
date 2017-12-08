package emsamablajecomputadoras.creacional;

public class ComputadorDirector {

	private ComputadorBuilder compuBuilder;
	
	public ComputadorDirector(ComputadorBuilder builder) {
		this.compuBuilder=builder;
	}
	
	public void ConstruirComputador() {
		compuBuilder.DefinirComputadora();
		compuBuilder.ConstruirMainboard();
		compuBuilder.ConstruirSistemaOperativo();
		compuBuilder.DefinirExtras();
	}
	
	public Computador getComputador() {
		return compuBuilder.getComputadora();
	}
}
