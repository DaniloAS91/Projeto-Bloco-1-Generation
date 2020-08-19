package trocaBook;

import java.util.ArrayList;
import java.util.List;

public class GerenciaLivros{
	
	List <Cliente> listaCliente = new ArrayList<Cliente>();
	List <Livro> listaLivros = new ArrayList<Livro>();
	
	
	public void cadastraLivro(Livro l) { //OK
		if(listaLivros.contains(l)) {
			for (Livro lv : listaLivros) {
				if(l.getCod() == lv.getCod()) {
					lv.setQtde(lv.getQtde()+l.getQtde());
				}
			}
		}
		else {
			listaLivros.add(l);
		}
	}
	
	public void removeLivro(int cod) { //OK
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
			System.out.println("Lista Vazia!!");
		}
		
	}
	
	public void cadastraCliente(Cliente c) { // OK
		if(listaCliente.contains(c)) {
			System.out.println("Cliente ja cadastrado!!");
		}
		else {
			listaCliente.add(c);
			System.out.println("Cliente Cadastrado com Sucesso!!");
		}
	}
	
	public void removeCliente(String cpf) { // OK
		
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
	
	public void consultaLivro() { // OK
		if (listaLivros.isEmpty() != true) {
			for (Livro lv : listaLivros) {
				System.out.println(lv.dadosLivro());
				System.out.println("\n");
					
			}
		}
		else {
			System.out.println("\nNenhum Livro Cadastrado para Troca!!");
		}
			
	}
	
	public void trocaLivro(int cod, String cpf) { //OK
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
												"\nQtde: 01");
							listaLivros.remove(lv);							
							System.out.println("Agora só Efetuar a Troca!!\nBoa Leitura");
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
