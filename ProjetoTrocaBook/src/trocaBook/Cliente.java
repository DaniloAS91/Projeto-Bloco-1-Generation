package trocaBook;

public class Cliente {
	private String nome;
	private String cpf;
	private String endereco;
	
	
	public Cliente(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public String dadosCliente() { // retorna dados do Cliente
		return "\nNome: "+nome+
				"\nCPF: "+cpf+
				"\nEndereço: "+endereco;
				
	}
	
	// Getters and Setters
	
	public final String getNome() {
		return nome;
	}

	public final void setNome(String nome) {
		this.nome = nome;
	}

	public final String getCpf() {
		return cpf;
	}

	public final void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public final String getEndereco() {
		return endereco;
	}

	public final void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
}
