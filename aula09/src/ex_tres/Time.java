package ex_tres;

public class Time  {
	
	
	private String nomeTime, tecnico, diretor;
 
	
	public Time(String nomeTime, String tecnico, String diretor) {
		super();
		this.nomeTime = nomeTime;
		this.tecnico = tecnico;
		this.diretor = diretor;
	}


	@Override
	public String toString() {
		return "Time: " + nomeTime + ", Tecnico" + tecnico + ", Diretor" + diretor ;
	}


	public String getNomeTime() {
		return nomeTime;
	}
	

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	
	public String getTecnico() {
		return tecnico;
	}

	
	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}
	

	public String getDiretor() {
		return diretor;
	}
	

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	
	
	
	
}
