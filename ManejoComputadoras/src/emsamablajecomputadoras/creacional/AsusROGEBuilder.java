package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends ComputadorBuilder {

	@Override
	public void DefinirComputadora() {
		compu=new Computador();
		compu.setMarca(" Asus");
		compu.setModelo("ROG");
	}

	@Override
	public void ConstruirMainboard() {
		compu.setPlaca(new Mainboard("Strix","x99"));
	}

	@Override
	public void ConstruirSistemaOperativo() {
		compu.setOs(new SistemaOperativo("Windows",10,"PRO 64 bits"));
	}

	@Override
	public void DefinirExtras() {
		compu.setAlmacenamiento(1000);
		compu.setRam(32);
	}

	
	
}
