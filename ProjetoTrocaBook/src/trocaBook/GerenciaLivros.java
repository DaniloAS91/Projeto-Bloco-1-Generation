package trocaBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GerenciaLivros{
	
	List <Cliente> listaCliente = new ArrayList<Cliente>();
	List <Livro> listaLivros = new ArrayList<Livro>();
	List <Integer> listaDadosTroca = new ArrayList<Integer>();
	
	
	public void cadastraLivro(Livro l) { //OK
		listaLivros.add(l);
		
	}
	
	public void removeLivro(int cod) { //OK
		if(listaLivros.isEmpty() != true) {
			for(Livro l:listaLivros) {
				if(l.getCod() == cod) {
					listaLivros.remove(l);
					System.out.println("Livro Removido!!");
				}		
			}
		}
		else {
			System.out.println("Lista Vazia!!");
		}
		
	}
	
	public void cadastraCliente(Cliente c) { // OK
		listaCliente.add(c);
		
	}
	
	public void removeCliente(String cpf) { // OK
		
		if(listaCliente.isEmpty() != true) {
			for(Cliente c: listaCliente)	
				if(c.getCpf().equals(cpf)) {
					listaCliente.remove(c);
					System.out.println("Cliente Removido!!");
				}
		}
		else {
			System.out.println("Lista de Clientes Vazia!!");
		}
	}
	
	public String consultaLivro(int cod) {
		if (listaLivros.isEmpty() != true) {
			for (Livro lv : listaLivros) {
				if (lv.getCod() == cod) {
					
				}
			}
		}
			
	}
	
	public void trocaLivro() {
		
	}
}
