package Encapsulamento;

import javax.print.attribute.standard.Media;

public class Aluno {
	
	private String nome;
	private String ra;
	private double mensalidade;
	private double nota1;
	private double nota2;
	int divisor = 2;
	
	
	public void setNome(String nome1) {
		this.nome=nome1;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setra(String ra1) {
		this.ra=ra1;
	}
	
	public String getRa() {
		return ra;
	}
	
	public void setMensalidade(double mensalidade1) {
		this.mensalidade=mensalidade1;
	}
	
	public double getMensalidade() {
		return mensalidade;
	}
  
	public void setNota1(double notaf1) {
		this.nota1=notaf1;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public void setNota2(double notaf2) {
		this.nota2=notaf2;
	}
	
	public double getNota2() {
		return nota2;
	}
	
   void exibirMedia() {   //metodo
		
		System.out.println("Média " + ((this.nota1 + this.nota2)/2));
	}
	
	
	public double exibeMedia() {
		return ((getNota1 () + getNota2())/2);
	}

	double calculoMedia() {
		double media = (this.nota1+this.nota2)/2;
		return media;
		}
	
	void verificaStatus() {
		
		if (calculoMedia()>7) {
        System.out.printf("Média %f, Aprovado!", calculoMedia());
        }else {
        	System.out.printf("Média %f, Reprovado!", calculoMedia());	
        }
	
	}
	
}
