package model;

public class Pessoa {

	private String nome, endereco;
	private int anoNascimento;
	private boolean jaFezAniversario;
	private int idade;
	private int anoAtual = 2023;

	public Pessoa(String nome, String endereco, int anoNascimento, boolean jaFezAniversario) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.anoNascimento = anoNascimento;
		this.jaFezAniversario = jaFezAniversario;
	}

	public int getIdade() {
		int idade = anoAtual - anoNascimento;

		if (!jaFezAniversario) {
			idade--;
		}
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean getJaFezAniversario() {
		return jaFezAniversario;
	}

	public void setJaFezAniversario(boolean jaFezAniversario) {
		this.jaFezAniversario = jaFezAniversario;
	}

}
