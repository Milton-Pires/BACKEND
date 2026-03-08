import java.time.LocalDate;

public class Manutencao {
    private String id;
    private Equipamento equipamento;
    private LocalDate dataInspecao;
    private Usuario tecnicoResponsavel;
    private boolean aprovado;
    private String observacoes;
    private StatusManutencao status;

    public boolean concluida(){
        return status == StatusManutencao.OK;
    }

    public boolean tecnicoValido(){
        return tecnicoResponsavel.podeRealizarManutencao();
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Equipamento getEquipamento() {
        return equipamento;
    }
    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }
    public LocalDate getDataInspecao() {
        return dataInspecao;
    }
    public void setDataInspecao(LocalDate dataInspecao) {
        this.dataInspecao = dataInspecao;
    }
    public Usuario getResponsavel() {
        return tecnicoResponsavel;
    }
    public void setResponsavel(Usuario responsavel) {
        this.tecnicoResponsavel = responsavel;
    }
    public boolean isAprovado() {
        return aprovado;
    }
    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
    
}
