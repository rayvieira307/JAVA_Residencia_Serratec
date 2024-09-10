package ex1;

import java.time.LocalDate;

import java.time.LocalDate;

public class Carro extends Veiculo implements Oficina{
    private String categoria;

    public Carro(String modelo, LocalDate dataConserto, Proprietario proprietario, String categoria) {
        super(modelo, dataConserto, proprietario);
        this.categoria = categoria;
        this.valorCobrado = 0.;
    }
	public String getCategoria() {
        return categoria;
    }

    @Override
    public Double lavarVeiculo() {
        return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public Double trocarOleo() {
        if(dataConserto.getDayOfWeek().getValue() == 6){
            return valorCobrado += (TipoServico.OLEO.getValorPorServico() - 50);
        }else {
            return valorCobrado += TipoServico.OLEO.getValorPorServico();
        }
    }

    @Override
    public Double revisao() {
        if(dataConserto.getMonth().getValue() == 8){
            return valorCobrado += TipoServico.REVISAO.getValorPorServico()* 0.90;

        }else {
            return valorCobrado += TipoServico.REVISAO.getValorPorServico();
        }
    }

    @Override
    public String toString() {
        return String.format("""
                ------Carro------
                Modelo: %s
                Categoria: %s
                dataConserto: %s
                valorCobrado: R$%.2f
                Proprietario: %s
                """, modelo, categoria, dataConserto, valorCobrado, proprietario.getNome());
    }
}