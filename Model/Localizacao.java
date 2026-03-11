package model;
public class Localizacao{
    private String bloco;
    private String andar;
    private String sala;
    private String descricao;
    private String nome; //Trocar para endereço
    
    public Localizacao(String bloco, String andar, String sala, String descricao, String nome) {
        this.bloco = bloco;
        this.andar = andar;
        this.sala = sala;
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    
}