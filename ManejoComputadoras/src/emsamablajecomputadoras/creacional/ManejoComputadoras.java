package emsamablajecomputadoras.creacional;

public class ManejoComputadoras {

	public static void main(String[] args) {
		//Computadora AsusROGE
		ComputadorDirector compuDirector=new ComputadorDirector(new AsusROGEBuilder());
		compuDirector.ConstruirComputador();
		Computador AsusRoge=compuDirector.getComputador();
		System.out.println("Primer computador:"+AsusRoge.especificacionesTecnicas());
		
		//Computadora Asus Zenbook
		ComputadorDirector Zenbookdirector=new ComputadorDirector(new AsusZenbookBuilder());
		Zenbookdirector.ConstruirComputador();
		Computador AsusZenbook=Zenbookdirector.getComputador();
		System.out.println("Primer computador:"+AsusZenbook.especificacionesTecnicas());
		
	}

}
