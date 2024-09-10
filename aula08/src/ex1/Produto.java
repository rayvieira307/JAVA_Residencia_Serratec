package ex1;

public class Produto  {
       
	private int CODIGO;
	private String descricao;
	private Double valor;
	private Categoria categoria;
	
	
	public Produto(int cODIGO, String descricao, Double valor, Categoria categoria) {
		super();
		CODIGO = cODIGO;
		this.descricao = descricao;
		this.valor = valor;
		this.categoria = categoria;
	}


	public int getCODIGO() {
		return CODIGO;
	}


	public String getDescricao() {
		return descricao;
	}


	public Double getValor() {
		return valor;
	}


	public Categoria getCategoria() {
		return categoria;
	}
	
	
	
	
	
	
	
	
	
}
