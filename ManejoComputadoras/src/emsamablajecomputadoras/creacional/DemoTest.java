package emsamablajecomputadoras.creacional;

public class DemoTest {

	public static void main(String[] args) {
		AbstractTest tar1=new TestIniciaAR("1");
		AbstractTest tar2=new TestIntermedioAR("2");
		AbstractTest tar3=new TestFinalAR("3");
		
		tar1.setSiguienteTest(tar2);
		tar2.setSiguienteTest(tar3);
	
		ComputadorDirector compuDirector=new ComputadorDirector(new AsusROGEBuilder());
		compuDirector.ConstruirComputador();
		Computador AsusRoge=compuDirector.getComputador();
		System.out.println("Primer computador:"+AsusRoge.especificacionesTecnicas());
	 
		tar1.setComputador(AsusRoge);
		tar1.valido();
	}
	
}
