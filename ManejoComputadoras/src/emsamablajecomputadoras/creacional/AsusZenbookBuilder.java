package emsamablajecomputadoras.creacional;

public class AsusZenbookBuilder extends ComputadorBuilder {

	@Override
	public void DefinirComputadora() {
		compu=new Computador();
		compu.setMarca(" Asus");
		compu.setModelo("Zenbook");
	}

	@Override
	public void ConstruirMainboard() {
		compu.setPlaca(new Mainboard("Prime","Z370"));
	}

	@Override
	public void ConstruirSistemaOperativo() {
		compu.setOs(new SistemaOperativo("Windows",10,"Home 64 bits"));
	}

	@Override
	public void DefinirExtras() {
		compu.setAlmacenamiento(500);
		compu.setRam(16);
	}

}
