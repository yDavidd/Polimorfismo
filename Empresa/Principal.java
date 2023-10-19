package Empresa;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(11, "David Kauan", "(15)997453333", 12345, "Londres, Inglaterra");
		System.out.println("Jornada: ");
		System.out.println("Id: " + jornada.getId());
		System.out.println("Nome: " + jornada.getNome());
		System.out.println("Telefone: " + jornada.getTelefone());
		System.out.println("Matrícula: " + jornada.getMatricula());
		System.out.println("Endereço: " +  jornada.getEndereco());
		System.out.println("Salário: " + jornada.calculaSalario(200, 10));
		
		Horista horista = new Horista(12, "David Kauan", "(15)997453333", 12345, "Londres, Inglaterra");
		System.out.println("\nHorista: ");
		System.out.println("Id: " + horista.getId());
		System.out.println("Nome: " + horista.getNome());
		System.out.println("Telefone: " + horista.getTelefone());
		System.out.println("Matrícula: " + horista.getMatricula());
		System.out.println("Endereço: " +  horista.getEndereco());
		System.out.println("Salário: " + horista.calculaSalario(150, 12));
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica(13, "David Kauan", "(15)997453333", 12345, "Londres, Inglaterra");
		System.out.println("\nPessoa Jurídica: ");
		System.out.println("Id: " + pessoaJuridica.getId());
		System.out.println("Nome: " + pessoaJuridica.getNome());
		System.out.println("Telefone: " + pessoaJuridica.getTelefone());
		System.out.println("Matrícula: " + pessoaJuridica.getMatricula());
		System.out.println("Endereço: " +  pessoaJuridica.getEndereco());
		System.out.println("Salário: " + pessoaJuridica.calculaSalario(6000, 435));

	}

}
