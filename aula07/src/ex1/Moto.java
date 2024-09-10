package ex1;

import java.time.LocalDate;

import java.time.LocalDate;

public class Moto extends Veiculo implements Oficina{
    private int cilindradas;

    public Moto(String modelo, LocalDate dataConserto, Proprietario proprietario, int cilindradas) {
        super(modelo, dataConserto, proprietario);
        this.cilindradas = cilindradas;
        this.valorCobrado = 0.;
    }

    @Override
    public String toString() {
        return String.format("""
                ------Moto------
                Modelo: %s
                Cilindradas: %d
                dataConserto: %s
                valorCobrado: R$%.2f
                Proprietario: %s
                """, modelo, cilindradas, dataConserto, valorCobrado, proprietario.getNome());
    }

    @Override
    public Double lavarVeiculo() {
        return valorCobrado += TipoServico.LAVAGEM.getValorPorServico();
    }

    @Override
    public Double trocarOleo() {
        return valorCobrado += TipoServico.OLEO.getValorPorServico();
    }

    @Override
    public Double revisao() {
        return valorCobrado += TipoServico.REVISAO.getValorPorServico();
    }
}
