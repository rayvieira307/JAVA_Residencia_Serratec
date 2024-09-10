package ex1;

import java.time.LocalDate;

public class Venda implements FinalizarVenda  {
 
	private Produto produto;
	private LocalDate dataCompra;
	private int quantidade;
	private static double totalVenda = 0;
	
	public Venda(Produto produto, LocalDate dataCompra, int quantidade) {
		super();
		this.produto = produto;
		this.dataCompra = dataCompra;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return  produto.getDescricao() + "-" + produto.getValor();
	}

	public Produto getProduto() {
		return produto;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public static Double getTotalVenda() {
		return totalVenda;
	}

	@Override
	public void calcularVenda() {
		
		totalVenda += produto.getValor() * quantidade;
		mostrarVenda();
		
	}
	
	public void mostrarVenda() {
		
	  // System.out.printf(//"""
	    		
	    	//	%s - %.2f
	    	//	valorTotal: %.2f
	        //	data da compra: %s
	    	//	""", produto.getDescricao(), produto.getValor(), totalVenda, dataCompra);
		
	}
	
}
