package Encapsulamento;

import java.util.Scanner;

public class ContaCorrente {

	//Scanner ler = new Scanner(System.in);
	
	private String nome;
	private String senha;
	private double saldo;
	
	
	//SET
	
	public void setNome(String nome) {
		this.nome=nome;
	}
    //GET
	public String getNome() {
		return nome;
	}
	
	//SET
	public void setSenha(String senha) {
		this.senha=senha;
	}
	//GET
	public String getSenha() {
		return senha;
	}
	//SET
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	//GET
	public double getSaldo() {
		return saldo;
	}
	
	//public String trocaSenha () {
	//Scanner lerTeclado = new Scanner(System.in);
	//senha = lerTeclado.next();
	//return (senha);
    // }
	
	//Métodos
	void exibirDados() {
		
		System.out.println("" +this.nome);
		System.out.println("" +this.saldo);
		System.out.println("" +this.senha);
	    }
	
	String alteraSenha(String novaSenha) {
    this.senha = novaSenha;
    return novaSenha;
	}
	
	void creditar() {
	}
	
	void debitar() {
	}
	
	
	
	
}	
	
	
	
