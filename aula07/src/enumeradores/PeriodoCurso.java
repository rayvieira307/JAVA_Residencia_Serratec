package enumeradores;

public enum PeriodoCurso {
   
	NOTURNO("terça e quarta", 2500.,40), 
	INTEGRAL("segunda e sexta", 1800.,20),
	TARDE("quinta e sexta", 3200., 80);
	
	private String dias;
	private Double valor;
	private Integer cargaHoraria;
	
	private PeriodoCurso(String dias, Double valor, Integer cargaHoraria) {
		this.dias = dias;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}
	

	public String getDias() {
		return dias;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
}
