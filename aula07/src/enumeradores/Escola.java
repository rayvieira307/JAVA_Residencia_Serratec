package enumeradores;


//Classe com final quer dizer que a classe é imutável e não pode ter filhos
//Nao pode ser sobreescrito
// No atributo fica constante 
public class Escola  {
    
	private String cnpj;
	private String razaoSocial;
	
	
	public Escola(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public final void gerarRelatorio() {
		
		System.out.println("Relátorio! ");
		
	}
}
