package exercicio;

public  class Fixo extends Vendedor {
    
	private Double salarioBase;
	private Double salarioBruto;
	private Double comissao;
	
	
	public Fixo(String nome, String cPF, Double salarioBase,  Double comissao ) {
	
		super(nome, cPF);
		this.salarioBase = salarioBase;
		this.salarioBruto = salarioBase;
		this.comissao = comissao;
	}


    @Override
    public String toString() {
        
    	return "cpf" + CPF + "Nome" + nome + "Comissão" + comissao + "Salario Base" + salarioBase + "Salario Bruto" + salarioBruto;
        		
    }
   

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	
	}
	
	public void calcularSalario(Double valorVenda){
		
		
	}
	

	}





	
	

		
	

