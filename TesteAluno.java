package Encapsulamento;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// DECLARAR OS ALUNOS E SUAS CLASSES 
	      Aluno a1 = new Aluno();
	      
	      a1.setNome("Márcio");
	      a1.setMensalidade(1000);
	      a1.setra("3002");
	      a1.setNota1(7);
	      a1.setNota2(8);
	      a1.exibeMedia();
	      a1.verificaStatus();
	      
		
		
	      System.out.println(" ********* DADOS DO ALUNO ********** ");
	      
	      System.out.println("Nome do aluno: " +a1.getNome());
	      System.out.println("RA do aluno: " +a1.getRa());
	      System.out.println("Mensalidade: " +a1.getMensalidade());
	      System.out.println("Nota1: " +a1.getNota1());
	      System.out.println("Nota2: " +a1.getNota2());
	      System.out.println("Média do aluno: " +a1.exibeMedia());
	      
	      a1.verificaStatus();
		
		}

}
