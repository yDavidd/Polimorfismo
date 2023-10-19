package InterfaceComp;

public class Home implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("O PC está ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("O PC está reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("O PC está desligando");
	}
	@Override
	public void carregandoSistema() {
		System.out.println("O PC está carregando o sistema");
	}

}
