package Encapsulamento;

public class Vendedor extends CaseFuncionarios {

	private String codigoAcesso;
	private String comissao;
	
	
	public void setcodigoAcesso(String codacess1) {
		this.codigoAcesso=codacess1;
	}
	
	public String getcodigoAcesso() {
		return codigoAcesso;
	}
	
	public void setcomissao(String comissao1) {
		this.comissao=comissao1;
	}
	
	public String getcomissao() {
		return comissao;
	}
	
}
