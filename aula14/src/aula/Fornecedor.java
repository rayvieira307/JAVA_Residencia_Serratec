package aula;

import java.io.Serializable;

/**
 * @author Rayssa Vieira
 * @since Criado em setembro
 * 
 */

import java.util.Objects;

public class Fornecedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cnpj;
	private String nome;

	
	public Double pagamentoFornecedor (Double valor) throws IllegalArgumentException {
		return 0.0;
	}
	
	
	
	public Fornecedor(String cnpj, String nome) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Fornecedor: " + cnpj + ", nome: " + nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(nome, other.nome);
	}

	
	
	
}
