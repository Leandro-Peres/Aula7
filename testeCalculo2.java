
public class testeCalculo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculo2 calc1 = new Calculo2();  //calc1 = objeto
		
		calc1.setNumero1(20);   //chamar m�todo
		calc1.setNumero2(5);   //chamar m�todo
		
	
		
		System.out.println("N�mero 1 = " + calc1.getNumero1());
		System.out.println("N�mero 2 = " + calc1.getNumero1());
		
		
		calc1.exibirSoma();
		
		
		System.out.println("Resultado 2 = " + calc1.exibeSoma2());
		
		calc1.exibeSubtracao();
		
		System.out.println("Resultado Subtracao = " + calc1.exibeSubtracao());
		
		calc1.exibeMultiplicacao();
		
		System.out.println("Resultado Multipli��o = " + calc1.exibeMultiplicacao());
		
		calc1.exibeDivisao();
		
		System.out.println("Resultado Divis�o = " + calc1.exibeDivisao());

	}

}
