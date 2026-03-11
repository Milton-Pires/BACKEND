package model;
import java.time.LocalDate;

public class Hidrante extends Equipamento {
    public Hidrante(String id, String nome, Localizacao localizacao, LocalDate dataInstalacao) {
        super(id, nome, localizacao, dataInstalacao);
        
    }

    private double pressaoAgua;
    private double compMangueira;
    private boolean disponivel;

    private boolean pressaoSuficiente() {
        return pressaoAgua >= 5; //pressao baixa impede o uso
    }

    private boolean operacional(){
        return disponivel && pressaoSuficiente();
    }

    public double getPressaoAgua() {
        return pressaoAgua;
    }
    public void setPressaoAgua(double pressaoAgua) {
        this.pressaoAgua = pressaoAgua;
    }
    public double getCompMangueira() {
        return compMangueira;
    }
    public void setCompMangueira(double compMangueira) {
        this.compMangueira = compMangueira;
    }
    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public boolean precisaManutencao() {
        return !operacional() || compMangueira < 20; //mangueira curta ou baixa pressão requer manutenção
    }

    @Override
    public String tipoEquipamento() {
        return "Hidrante";
    }
    

}
