package model;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String id;
    private String nomeEmpresa;
    private String cnpj;
    private String telefone;
    private String email;
    private String endereco;

    // Relações do sistema
    private List<Localizacao> localizacoes;
    private List<Equipamento> equipamentos;

    // Construtor
    public Cliente(String id, String nomeEmpresa, String cnpj, String telefone, String email, String endereco) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;

        this.localizacoes = new ArrayList<>();
        this.equipamentos = new ArrayList<>();
    }

    // Métodos de negócio

    public void adicionarLocalizacao(Localizacao localizacao){
        localizacoes.add(localizacao);
    }

    public void adicionarEquipamento(Equipamento equipamento){
        equipamentos.add(equipamento);
    }

    public void removerEquipamento(String idEquipamento){
        equipamentos.removeIf(e -> e.getId().equals(idEquipamento));
    }

    // Getters e Setters

    public String getId() {
        return id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Localizacao> getLocalizacoes() {
        return localizacoes;
    }

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }
}