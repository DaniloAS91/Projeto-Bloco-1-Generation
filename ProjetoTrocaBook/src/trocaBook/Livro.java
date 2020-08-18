package trocaBook;

public class Livro {
	
	private String titulo;
	private String categoria;
	private String autor;
	private int cod;
	private int qtde;
	
	
	public Livro(String titulo, String categoria, String autor, int cod, int qtde) {
		this.titulo = titulo;
		this.categoria = categoria;
		this.autor = autor;
		this.cod = cod;
		this.qtde = qtde;
	}
	
	
	public String dadosLivro() { // retorna dados do livro;
		return "\nTítulo: "+
				"\nAutor: "+autor+
				"\nCategoria: "+categoria+
				"\nCódigo: "+cod;
				
	}
	
	// Getters and Setters

	public final String getTitulo() {
		return titulo;
	}

	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public final String getCategoria() {
		return categoria;
	}

	public final void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public final String getAutor() {
		return autor;
	}

	public final void setAutor(String autor) {
		this.autor = autor;
	}

	public final int getCod() {
		return cod;
	}

	public final void setCod(int cod) {
		this.cod = cod;
	}

	public final int getQtde() {
		return qtde;
	}

	public final void setQtde(int qtde) {
		this.qtde = qtde;
	}
	

	
}
