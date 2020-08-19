package trocaBook;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.ListAdapter;

public class TesteBook {
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		GerenciaLivros gl = new GerenciaLivros();
		
		int op = -1, busca;
		String cpf;
		
		while(op != 0) {
			
			System.out.println("Menu:"
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
				Cliente cl = new Cliente(null, null, null);
				
				System.out.println("Digite o Nome do Clinte: ");
				cl.setNome(sc.next());
				System.out.println("Digite o CPF do Cliente");
				cl.setCpf(sc.next());
				System.out.println("Digite o Endereço do Cliente;");
				cl.setEndereco(sc.next());
				
				gl.cadastraCliente(cl);
				
				break;
				
			case 2 :
				System.out.println("Digite o CPF do cliente para remover: ");
				cpf = sc.next();
				gl.removeCliente(cpf);
				
				break;
				
			case 3 :
				Livro lv = new Livro(null, null, null, 0, 0);
				
				System.out.println("Digite o Titulo do Livro: ");
				lv.setTitulo(sc.next());
				System.out.println("Digite o Autor do Livro: ");
				lv.setAutor(sc.next());
				System.out.println("Digite a Categoria do Livro: ");
				lv.setCategoria(sc.next());
				System.out.println("Digite o Código do Livro: ");
				lv.setCod(sc.nextInt());
				System.out.println("Digite a Qtde de Livros: ");
				lv.setQtde(sc.nextInt());
				
				gl.cadastraLivro(lv);
				
				break;
				
			case 4 :
				System.out.println("Digite o Código do Livro para Remover: ");
				busca = sc.nextInt();
				
				gl.removeLivro(busca);
				
				break;
				
			case 5 :
				System.out.println("Digite o Código do Livro: ");
				busca = sc.nextInt();
				
				gl.consultaLivro(busca);
				
				break;
				
			case 6 :
				
				System.out.println("Digite o Código do Livro: ");
				busca = sc.nextInt();
				
				gl.trocaLivro(busca);
				
				break;
				
			case 0 :
				System.out.println("Saindo...");
				break;
				
			default:
				System.out.println("Ops... a mão escorregou... tente novamente!!");
					
			}
			
			
			
		}
		sc.close();
		
	}

}