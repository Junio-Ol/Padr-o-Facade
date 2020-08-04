
public class ComputadorFacade {
	private Memoria memoria;
	private Processador pro;
	private HD hd;
	
	public ComputadorFacade() {
		this.memoria = new Memoria();
		this.pro = new Processador();
		this.hd = new HD();
	}
	
	public void executar() {
		memoria.executar();
		pro.executar();
		hd.executar();
	}
	

}
