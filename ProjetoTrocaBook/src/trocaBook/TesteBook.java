package trocaBook;

import java.util.Scanner;

public class TesteBook {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		GerenciaLivros gl = new GerenciaLivros();
		
		String cpf;
		int op = -1, busca;
		
		while(op != 0) {
			
			System.out.println("\nMenu:"
					+ "\nEscolha: \n"
					+ "\n1 - Cadastrar Cliente"
					+ "\n2 - Deletar Cliente"
					+ "\n3 - Cadastrar Livro"
					+ "\n4 - Deletrar Livro"
					+ "\n5 - Consultar Livro"
					+ "\n6 - Trocar Livro"
					+ "\n0 - Sair");
			op = sc.nextInt();
			
			switch(op) {
			
			case 1 : // CADASTRA CLIENTE
				
				System.out.println("Digite o CPF do Cliente");
				cpf = sc.next();
				
				gl.cadastraCliente(cpf);
				
				
				break;
				
			case 2 : // REMOVE CLIENTE
				
				System.out.println("\n-- Remoção de Cliente --");
				System.out.println("Digite o CPF do cliente para remover: ");
				cpf = sc.next();
				gl.removeCliente(cpf);
				
				break;
				
			case 3 : // CADASTRA LIVRO
				
				System.out.println("\n-- Cadastro de Livro --");
				
				System.out.println("Informe seu CPF: ");
				cpf = sc.next();
				
				gl.cadastraLivro(cpf);
				
				break;
				
			case 4 : // REMOVE LIVRO
				
				System.out.println("\n-- Excluir Livro --");
				System.out.println("\nDigite o Código do Livro para Remover: ");
				busca = sc.nextInt();
				
				gl.removeLivro(busca);
				
				break;
				
			case 5 : // LISTAR LIVROS PARA TROCA
				
				System.out.println("\n-- Lista de Livros --");
				
				gl.consultaLivro();
				
				break;
				
			case 6 : // EFETUA TROCA DE LIVROS
				
				System.out.println("\n-- Troca de Livros --");
				System.out.println("Digite o Código do Livro: ");
				busca = sc.nextInt();
				System.out.println("Digite o seu CPF: ");
				cpf = sc.next();
				
				gl.trocaLivro(busca, cpf);
				
				break;
				
			case 0 : // SAIR
				
				System.out.println("Saindo...");
				break;
				
			default: // CASO DIGITE VALORES ERRADOS
				System.out.println("Ops... 70 70 se não der 70 novamente... ;P !!");
					
			}
		}
		sc.close();
		
	}
}