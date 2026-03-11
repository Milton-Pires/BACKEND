package model;
import java.time.LocalDate;

public class Extintor extends Equipamento {

    private String classeFogo;
    private double capacidade;
    private LocalDate dataValidade;
    private int pressao;

    public Extintor(String id, String nome, Localizacao localizacao, LocalDate dataInstalacao, LocalDate dataValidade) {
        super(id, nome, localizacao, dataInstalacao);
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido() {

        if(dataValidade == null) {
            return false; // Considera como não vencido se a data de validade não for definida
        }
        return dataValidade.isBefore(LocalDate.now());
    }

    public boolean pressaoAdequada() {
        return pressao >= 10;
    }

    public boolean prontoPraUso() {
        return !estaVencido() && pressaoAdequada() && ativo;
    }
    @Override
    public String tipoEquipamento() {
        return "Extintor";
    }
    @Override
    public boolean precisaManutencao() {

        if(dataValidade == null) {
            return false; // Considera como não precisa de manutenção se a data de validade não for definida
        }

        return dataValidade.isBefore(LocalDate.now());
    }

    public String getClasseFogo() {
        return classeFogo;
    }

    public void setClasseFogo(String classeFogo) {
        this.classeFogo = classeFogo;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    public int getPressao() {
        return pressao;
    }

    public void setPressao(int pressao) {
        this.pressao = pressao;
    }

    

}
