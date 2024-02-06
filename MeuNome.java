import java.util.Scanner;
public class MeuNome {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		System.out.println("Bem vindo ao programa!!! Para começar digite seu nome: ");
		nome = leia.next();
		System.out.println("Muito obrigado por executar o programa " + nome + "!");
	}
}
