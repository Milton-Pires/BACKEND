package model;
import enums.StatusManutencao;
import java.time.LocalDate;

public class Manutencao {
    private String id;
    private Equipamento equipamento;
    private LocalDate dataManutencao;
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
    public LocalDate getdataManutencao() {
        return dataManutencao;
    }
    public void setdataManutencao(LocalDate dataManutencao) {
        this.dataManutencao = dataManutencao;
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
