package ex1;

public class Livro {


	    private String autor;
	    private String titulo;
	    private double valor;


	    public Livro(String autor, String titulo, double valor) {
	        super();
	        this.autor = autor;
	        this.titulo = titulo;
	        this.valor = valor;
	    }

	    @Override
	    public String toString() {
	        return "\nLivro autor: " + autor + " titulo: " + titulo + "valor: " + valor ;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public double getValor() {
	        return valor;
	    }

	    public void setValor(double valor) {
	        this.valor = valor;
	    }

	    public void reajuste (double valor2) {
	    	
	     this.valor += valor * (valor2/100) ; 
	    }
	}
