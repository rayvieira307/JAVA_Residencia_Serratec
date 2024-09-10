package ex1;

public class Operacao implements Livraria {
 
	private String tipo;
	private double ValorOperacao ;
	private Livro livro;
	
	
	public Operacao(String tipo, Livro livro) {
		
		this.tipo = tipo;
		this.livro = livro;
		
	}
	


	@Override
	public String toString() {
		return "Tipo:" + tipo + " Valor:"+    ValorOperacao + " Autor:" + livro.getAutor() + " Livro:" + livro.getTitulo();
	}



	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public double getValorOperacao() {
		return ValorOperacao;
	}


	public void setValorOperacao(double valorOperacao) {
		ValorOperacao = valorOperacao;
	}


	public Livro getLivro() {
		return livro;
	}


	public void setLivro(Livro livro) {
		this.livro = livro;
	}



	@Override
	public void emprestarlivro() {
		
		ValorOperacao = livro.getValor() * 0.02  + TAXAEMPRESTIMO ;
		
	}



	@Override
	public void venderlivro() {
		
		ValorOperacao = livro.getValor() * 1.09;
		
	}
	
	
	
	
	
}
