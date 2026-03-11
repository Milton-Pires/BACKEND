package model;
import java.time.LocalDate;

import enums.Status;

public class Inspecao {
    private String id;
    private Equipamento equipamento;
    private Cliente cliente;
    private LocalDate dataInspecao;
    private Usuario responsavel;
    private boolean aprovado;
    private String observacoes;
    private Status status;
    private Localizacao localizacao;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }

    public String relatorio(){
        return "Equipamento: " + equipamento.nome +
           "\nResponsável: " + responsavel.getNome() +
           "\nAprovado: " + aprovado +
           "\nObs: " + observacoes;
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
        return responsavel;
    }
    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
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

    public Status getStatus() {
        return status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    
}
