
public class Calculo2 {

	private double numero1;
	private double numero2;
	
	public void setNumero1(double num1) {
		this.numero1=num1;
	}
	
	public void setNumero2(double num2) {
		this.numero2=num2;
	}
	
	public double getNumero1() {
	return this.numero1;
	}
	public double getNumero2() {
		return this.numero2;
	}
	
	void exibirSoma() {   //metodo
		
		System.out.println("Resultado 1 " + (this.numero1+this.numero2));
	}
	
	
	public double exibeSoma2() {
		return (getNumero1 () + getNumero2());
	}
	
	//SUBTRA��O
    void exibirSubtracao() {   //metodo
		
		System.out.println("Resultado Subtra��o " + (this.numero1-this.numero2));
	}
	
	
	public double exibeSubtracao() {
		return (getNumero1 () - getNumero2());
	}
	
	//MULTIPLICA��O
    void exibirMultiplicacao() {   //metodo
		
		System.out.println("Resultado Multiplicacao " + (this.numero1*this.numero2));
	}
	
	public double exibeMultiplicacao() {
		return (getNumero1 () * getNumero2());
	}
	
	//Divis�o
    void exibirDivisao() {   //metodo
		
		System.out.println("Resultado Divis�o " + (this.numero1/this.numero2));
	}
	
	public double exibeDivisao() {
		return (getNumero1 () / getNumero2());
	}
	
	
}
