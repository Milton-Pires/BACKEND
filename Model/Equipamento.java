package model;
import java.time.LocalDate;
import enums.Status;

public abstract class Equipamento{
    protected String id;
    protected String nome;
    protected Localizacao localizacao;
    protected LocalDate dataInstalacao;
    protected Status status;
    protected boolean ativo;

    // Construtor
    public Equipamento(String id, String nome, Localizacao localizacao, LocalDate dataInstalacao) {
        this.id = id;
        this.nome = nome;
        this.localizacao = localizacao;
        this.dataInstalacao = dataInstalacao;
        this.status = Status.PENDENTE;
        this.ativo = true;
    }

    //Métodos abstratos
    public abstract boolean precisaManutencao();

    public abstract String tipoEquipamento();


    // Métodos comuns
    public boolean estaOperacional(){
        return ativo && status == Status.CONCLUIDA;
    }

    public boolean precisaRevisao(){
        return dataInstalacao.plusYears(1).isBefore(LocalDate.now());
    }

    public boolean estaAtivo(){
        return ativo;
    }

    public int anosDeUso() {
        return LocalDate.now().getYear() - getDataInstalacao().getYear();
    }

    public void ativar(){
        this.ativo = true;
    }
    public void desativar(){
        this.ativo = false;
    }

    public String exibeInformacao(){
        return this.nome + " - " + this.status;
    }


    // Getters e Setters
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {

        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O nome do equipamento não pode ser vazio.");
        }

        this.nome = nome;
    }
    public Localizacao getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }
    public LocalDate getDataInstalacao() {
        return dataInstalacao;
    }
    public void setDataInstalacao(LocalDate dataInstalacao) {
        this.dataInstalacao = dataInstalacao;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    

}