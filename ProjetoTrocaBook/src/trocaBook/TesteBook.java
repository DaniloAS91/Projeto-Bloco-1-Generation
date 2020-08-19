package trocaBook;

import java.util.Scanner;

public class TesteBook {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		GerenciaLivros gl = new GerenciaLivros();
		
		int op = -1, busca;
		String cpf, nome, end; 		// dados do cliente
		String titulo,autor,cat;	// dados do livro
		int codLv, qtdeLv; 			// Código do livro e Qtde de Livros
		
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
			
			case 1 :
			
				System.out.println("\n-- Cadastro de Cliente --");
				sc.nextLine();
				System.out.println("Digite o Nome do Cliente: ");
				nome = sc.nextLine().toUpperCase();				
				
				System.out.println("Digite o CPF do Cliente");
				cpf = sc.next();
				
				sc.nextLine();
				System.out.println("Digite o Endereço do Cliente;");
				end = sc.nextLine().toUpperCase();
				
				
				
				Cliente cl = new Cliente(nome, cpf, end);
				System.out.println(cl.dadosCliente());
				gl.cadastraCliente(cl);
				
				
				break;
				
			case 2 :
				System.out.println("\n-- Remoção de Cliente --");
				System.out.println("Digite o CPF do cliente para remover: ");
				cpf = sc.next();
				gl.removeCliente(cpf);
				
				break;
				
			case 3 :
				
				
				System.out.println("\n-- Cadastro de Livro --");
				sc.nextLine();
				System.out.println("Digite o Titulo do Livro: ");
				titulo = sc.nextLine().toUpperCase();
				
				
				System.out.println("Digite o Autor do Livro: ");
				autor = sc.nextLine().toUpperCase();
				
				sc.nextLine();
				System.out.println("Digite a Categoria do Livro: ");
				cat = sc.nextLine().toUpperCase();
				
				System.out.println("Digite o Código do Livro: ");
				codLv = sc.nextInt();
				
				System.out.println("Digite a Qtde de Livros: ");
				qtdeLv = sc.nextInt();
				
				Livro lv = new Livro(titulo, cat, autor, codLv, qtdeLv);
				gl.cadastraLivro(lv);
				
				break;
				
			case 4 :
				System.out.println("\n-- Excluir Livro --");
				System.out.println("\nDigite o Código do Livro para Remover: ");
				busca = sc.nextInt();
				
				gl.removeLivro(busca);
				
				break;
				
			case 5 :
				System.out.println("\n-- Lista de Livros --");
				
				gl.consultaLivro();
				
				break;
				
			case 6 :
				
				System.out.println("\n-- Troca de Livros --");
				System.out.println("Digite o Código do Livro: ");
				busca = sc.nextInt();
				System.out.println("Digite o seu CPF: ");
				cpf = sc.next();
				
				gl.trocaLivro(busca, cpf);
				
				break;
				
			case 0 :
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Ops... 70 70 se não der 70 novamente... ;P !!");
					
			}
			
			
			
		}
		sc.close();
		
	}

}