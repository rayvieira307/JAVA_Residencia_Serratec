package relacao;

public class Imovel {
 
   private String tipo;
   private Double valor;
   private Pessoa pessoa;
  
   @Override
public String toString() {
	return "\nTipo: " + tipo + "\nValor: " + valor  + "\nPessoa: " + pessoa;
}



public String getTipo() {
	return tipo;
}



public void setTipo(String tipo) {
	this.tipo = tipo;
}



public Double getValor() {
	return valor;
}



public void setValor(Double valor) {
	this.valor = valor;
}



public Pessoa getPessoa() {
	return pessoa;
}



public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}



public Imovel(String tipo, Double valor, Pessoa pessoa) {
	super();
	this.tipo = tipo;
	this.valor = valor;
	this.pessoa = pessoa;
}
   
   
   
}
