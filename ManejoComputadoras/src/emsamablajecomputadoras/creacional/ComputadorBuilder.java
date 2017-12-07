package emsamablajecomputadoras.creacional;

public abstract class ComputadorBuilder {
	protected Computador compu;
	
	public Computador getComputadora(){
		return compu;
	
	}
	
	 public void createNewComputadorProduct() {
        compu = new Computador();
    }
	
	public abstract void DefinirComputadora();
	public abstract void ConstruirMainboard();
	public abstract void ConstruirSistemaOperativo();
	public abstract void DefinirExtras();
	
}
