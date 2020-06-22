
public class testeCalculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculo calc1 = new Calculo();
		Calculo calc2 = new Calculo(); //posso criar novos se quiser
		
	
		//calc1.soma(3, 2);
						
		System.out.println(calc1.soma(6, 4));
		System.out.println(calc2.soma(10, 4)); //posso colocar mais de um calculo!!!
		System.out.println(" O resultado deu: " + calc1.soma(20, 2)); //posso colocar mais de um calculo!!!
				
	}

}
