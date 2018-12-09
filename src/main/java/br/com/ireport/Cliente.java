package br.com.ireport;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private Integer idade;
	private String endereco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Cliente() {
	}

	public Cliente(String nm, int age) {
		setNome(nm);
		setIdade(age);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
