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
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	
	
	
}
