
package ex1;

import java.time.LocalDate;
import java.util.Observable;

public class Veiculo {
    protected String modelo;
    protected Double valorCobrado;
    protected LocalDate dataConserto;
    protected Proprietario proprietario;

    public Veiculo(String modelo,  LocalDate dataConserto, Proprietario proprietario) {
        this.modelo = modelo;
        this.dataConserto = dataConserto;
        this.proprietario = proprietario;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", valorCobrado=" + valorCobrado +
                ", dataConserto=" + dataConserto +
                ", proprietario=" + proprietario +
                '}';
    }
    public Double getValorCobrado() {
        return valorCobrado;
    }


}

