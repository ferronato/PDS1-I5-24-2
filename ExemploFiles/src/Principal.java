import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		String nomeArquivo = "contatinhos.txt";
		
		//Contatinho ct = new Contatinho("Lucas Santos","lucas@gmail.com","3451341234","estudante");
//		System.out.println(ct);
		
		agenda.addContatinho(new Contatinho("Marcelo Santos", "marcelo@teste.com", "233453453","engenheiro"));
		agenda.addContatinho(new Contatinho("Ana Silva", "ana@exemplo.com", "678678678","veterinaria"));
		agenda.addContatinho(new Contatinho("Beatriz Almeida", "be@teste.com", "6768678","designer"));
		agenda.addContatinho(new Contatinho("Paulo Xavier", "paulo@exemplo.com", "678678","professor"));
		
		//Salvar contatos no arquivo
		agenda.salvarLista(nomeArquivo);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Favor informar um nome para procurar: ");
		String nome = scanner.nextLine();
		
		Contatinho contatinho = agenda.lerContatinhoPorNome(nome, nomeArquivo);
		
		System.out.println(contatinho);
		
		if(contatinho != null) {
			System.out.println("Oba, achei o contatinho:");
			System.out.println("Nome: " + contatinho.getNome());
			System.out.println("E-mail: " + contatinho.getEmail());
			System.out.println("Telefone: " + contatinho.getTelefone());
			System.out.println("Categoria: " + contatinho.getCategoria());
		} else {
			System.out.println("Contatinho não encontrado!");
		}
		
		
		
		
		
	}

}
