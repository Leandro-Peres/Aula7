package Encapsulamento;

public class TesteCaseFuncin�rios {

	public static void main(String[] args) {
		//
      // DECLARAR OS FUNCION�RIOS E SUAS CLASSES 
      CaseFuncionarios f1 = new CaseFuncionarios();
      Gerente g1 = new Gerente();
      Vendedor v1 = new Vendedor();
      
      // DADOS DO FUNCION�RIO
      f1.setNome("Leandro");
      f1.setSalario(5000);
      f1.setEndereco("Rua Prof. Sylas, 293");
      f1.calculaBonificacao();
      
      // DADOS DO GERENTE
      g1.setUsuario("Space");
      g1.setSenha("Cross");
      g1.setNome("Jos�");
      g1.setEndereco("Rua Dois");
      g1.setSalario(23000);
      g1.calculaBonificacao();
 
      // DADOS DO VENDEDOR
      v1.setNome("Marcos");
      v1.setEndereco("Rua Quatro");
      v1.setSalario(2300);
      v1.setcomissao("20% do valor vendido");
      v1.setcodigoAcesso("2345");
      
      
      System.out.println(" ********* DADOS DO FUNCION�RIO ********** ");
      
      System.out.println(f1.getNome());
      System.out.println(f1.getEndereco());
      System.out.println(f1.getSalario());
      System.out.println("Bonifica��o: " + f1.calculaBonificacao());
      System.out.println();
      
      System.out.println(" ********* DADOS DO GERENTE ********** ");
      System.out.println();
      
      System.out.println("Nome: " + g1.getNome());
      System.out.println("Sal�rio: " +g1.getSalario());
      System.out.println("Endere�o: " +g1.getEndereco());
      System.out.println("Usu�rio: " + g1.getUsuario());
      System.out.println("Senha: " + g1.getSenha());
      System.out.println("Bonifica��o " + g1.calculaBonificacao()); // M�todo sobrescrito.
      
      System.out.println();
      System.out.println(" ********* DADOS DO VENDEDOR ********** ");
      System.out.println();
      
      System.out.println("Nome: " + v1.getNome());
      System.out.println("Sal�rio: " +v1.getSalario());
      System.out.println("Endere�o: " +v1.getEndereco());
      System.out.println("O percentual de comiss�o �: " + v1.getcomissao());
      System.out.println("O c�digo de Acesso �: " + v1.getcodigoAcesso());
      
        
			
		
	}

}
