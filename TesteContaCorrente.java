package Encapsulamento;
import java.util.Scanner;
public class TesteContaCorrente {

	public static void main(String[] args) {
		// Teste Conta Corrente

		
		Scanner read = new Scanner(System.in);
		ContaCorrente conta = new ContaCorrente();
	    
       
		  conta.setNome("Tião");
	      conta.setSenha("1234");
	      conta.setSaldo(10000);
	      
	      conta.exibirDados();
	      
	      
	   // Exibir dados da conta

	      System.out.println("Deseja alterar a sua senha?");
	      System.out.println("1 - Sim  ou outros - Não");
	      int resp = read.nextInt();
	      
	      if (resp == 1) {
	      System.out.println("Digite sua senha atual"); 
	      String senhaAtual = read.next();
	      
	      If (senhaAtual.contentEquals(conta.getSenha())) {
	       
	    	  System.out.println("informa a nova senha: ");
	    	  String novaSenha = read.next();
	    	  conta.alteraSenha(novaSenha);
	    	  
	    	  System.out.println("Nova senha alterada com sucesso! " + conta.getSenha());
	          }else {
	        	  System.out.print("Senha informada inválida! Informa a senha correta! - ("+ conta.getSenha()+")");
	          }
	    	  
	      }
	      
	}      
	    
}
