package trocaBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciaLivros{
	
	Scanner sc = new Scanner(System.in);
	List <Cliente> listaCliente = new ArrayList<Cliente>();
	List <Livro> listaLivros = new ArrayList<Livro>();
	
	public void cadastraCliente(String cpf) { // CADASTRA CLIENTE -- OK
		String nome, end, tel; // dados do cliente
		
		if (this.checaCadastro(cpf) == true) {
			sc.nextLine();
			System.out.println("Digite o Nome do Cliente: ");
			nome = sc.nextLine().toUpperCase();				
			
			System.out.println("Digite o Endereço do Cliente;");
			end = sc.nextLine().toUpperCase();
			
			System.out.println("Digite o Telefone do Cliente;");
			tel = sc.nextLine();
			
			Cliente cl = new Cliente(nome, cpf, end, tel);
			System.out.println(cl.dadosCliente());
			listaCliente.add(cl);
			System.out.println("\nCliente Cadastrado com Sucesso!!\n");
		}
		else {
			System.out.println("\nDe novo Amigo?... Cliente Já Cadastrado");
		}
	}
	
	public void removeCliente(String cpf) { // REMOVE CLIENTE -- OK
		
		if(listaCliente.isEmpty() != true) {
			for(Cliente c: listaCliente)	
				if(c.getCpf().equals(cpf)) {
					listaCliente.remove(c);
					System.out.println("Cliente Removido!!");
					break;
				}
		}
		else {
			System.out.println("Lista de Clientes Vazia!!");
		}
	}
	
	public void cadastraLivro(String cpf) { // CADASTRA LIVRO -- OK
		String titulo,autor,cat;	// dados do livro
		int codLv, qtdeLv; 			// Código do livro e Qtde de Livros
		sc.nextLine();
		System.out.println("Digite o Titulo do Livro: ");
		titulo = sc.nextLine().toUpperCase();
		
		System.out.println("Digite o Autor do Livro: ");
		autor = sc.nextLine().toUpperCase();
		
		System.out.println("Digite a Categoria do Livro: ");
		cat = sc.nextLine().toUpperCase();
		
		System.out.println("Digite a Qtde de Livros: ");
		qtdeLv = sc.nextInt();
		
		codLv = listaLivros.size() + 1;
		
		if(listaCliente.isEmpty() != true && this.checaCadastro(cpf) == true) {	
			for (Cliente cl : listaCliente) {
				if(cl.getCpf().equals(cpf) == true) {	
					Livro lv = new Livro(cl.getNome(), cpf, cl.getEndereco(), cl.getTel(), titulo, cat, autor, codLv, qtdeLv);
					System.out.println(lv.dadosLivro());
					listaLivros.add(lv);
					System.out.println("\nLivro Cadastrado com Sucesso!!\n");
					break;
				}
			}
		}
		else {
			System.out.println("CPF não Cadastrado..."
					+ "\n Seguindo Para Cadastro de Cliente...\n");
			this.cadastraCliente(cpf);
			System.out.println("\nInforme Novamente:");
			this.cadastraLivro(cpf);
				
		}
		
	}
	
	
	public boolean checaCadastro(String cpf) { // CHECA CADASTRO CLIENTE -- OK
		boolean result = true;
		for(Cliente cl : listaCliente) {
			if (cl.getCpf().equals(cpf)) {
				result = true;
			}
			else {
				result = false;
			}
		}
		return result;
	}
	
	
	public void removeLivro(int cod) { // REMOVE LIVRO DA LISTA -- OK
		if(listaLivros.isEmpty() != true) {
			for(Livro l:listaLivros) {
				if(l.getCod() == cod) {
					listaLivros.remove(l);
					System.out.println("Livro Removido!!");
					break;
				}		
			}
		}
		else {
			System.out.println("Lista de Livros Vazia!!");
		}
		
	}
	
	public void consultaLivro() { // CONSULTA LIVRO NA LISTA -- OK
		if (listaLivros.isEmpty() != true) {
			for (Livro lv : listaLivros) {
				System.out.println(lv.dadosLivro());
				System.out.println(" ");		
			}
		}
		else {
			System.out.println("\nNenhum Livro Cadastrado para Troca!!");
		}
			
	}
	
	public void trocaLivro(int cod, String cpf) { // EFETUA TROCA DO LIVRO -- MUDAR
		if (listaLivros.isEmpty() != true && listaCliente.isEmpty() != true) {
			for (Cliente cl: listaCliente) {
				if (cl.getCpf().equals(cpf)) {
					for (Livro lv : listaLivros) {
						if (lv.getCod() == cod) {
							
							System.out.println("\n\n-- Recibo de Troca --"
											+ "\nNome do Cliente: "+ cl.getNome()+
												"\nCPF: "+ cl.getCpf()+
												"\nEndereço: "+ cl.getEndereco()+
												"\nDados do Livro: "+
												"\nTitulo: "+ lv.getTitulo()+
												"\nAutor: "+ lv.getAutor()+
												"\nCódigo: "+ lv.getCod()+
												"\nQtde: 01"+
												"\n"+
												"\nAnunciante: "+ lv.getNome()+
												"\nContato: "+ lv.getTel());
							listaLivros.remove(lv);							
							System.out.println("\nAgora só Efetuar a Troca!!\nBoa Leitura");
							break;
							
						}
					}
				}
			}
		}
		else {
			System.out.println("Nenhum Livro ou Cliente Cadastrado!!");
		}
			
	}
	
}
