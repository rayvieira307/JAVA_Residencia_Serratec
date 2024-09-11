package aula;

public class ExemploGenerics<T> {
//Generics é uma classe que recebe qualquer tipo de objeto
//Todo generics deve ser referenciado qual classe ira receber <>		

	private T valor;

	@Override
	public String toString() {
		return "Exemplo Generics: " + valor;
	}

	public ExemploGenerics(T valor) {
		
		this.valor = valor;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

}
