package Encapsulamento;

public class Gerente extends CaseFuncionarios {

	private String usuario;
	private String senha;
	
	
	public void setUsuario(String usuario1) {
		this.usuario=usuario1;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
		
	public void setSenha(String senha1) {
		this.senha=senha1;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public double calculaBonificacao () {
		return getSalario() * 0.1+100; //override
	}
}
