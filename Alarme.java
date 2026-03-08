import java.time.LocalDate;

public class Alarme extends Equipamento {
    private String tipoSensor;
    private boolean funcionando;
    private LocalDate ultimaVerificacao;

    public Alarme(String id, String nome, Localizacao localizacao, LocalDate dataInstalacao) {
        super(id, nome, localizacao, dataInstalacao);
        
    }

    public boolean precisaTeste() {
        return ultimaVerificacao.plusMonths(6).isBefore(LocalDate.now());
    }

    @Override
    public String tipoEquipamento() {
        return "Alarme";
    }

    @Override
    public boolean precisaManutencao() {
        return ultimaVerificacao.plusMonths(6).isBefore(LocalDate.now());
    }

    public String getTipoSensor() {
        return tipoSensor;
    }

    public void setTipoSensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    public boolean sensorAtivo() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }

    public LocalDate getUltimaVerificacao() {
        return ultimaVerificacao;
    }

    public void setUltimaVerificacao(LocalDate ultimaVerificacao) {
        this.ultimaVerificacao = ultimaVerificacao;
    }

    

}
