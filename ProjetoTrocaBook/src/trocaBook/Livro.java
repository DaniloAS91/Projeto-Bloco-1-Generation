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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getQtde() {
		return qtde;
	}

	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public String imprimeLivro() {
		return "Titulo: "+this.titulo+
				"\nAutor: "+this.autor+
				"\nCategoria: "+this.categoria+
				"\nCódigo: "+this.cod+
				"\nQtde: "+this.qtde;
				
	}

	
}
