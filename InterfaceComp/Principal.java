package InterfaceComp;

public class Principal {

	public static void main(String[] args) {
		Gamer gamer = new Gamer();
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		
		Home home = new Home();
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
		
		

	}

}
